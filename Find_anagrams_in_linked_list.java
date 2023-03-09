class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
       ArrayList<Node> al=new ArrayList<>();
        int freq_s[]=new int[26]; // string freq array
        int[] freq_node=new int[26];// node freq array
        for(char c: s.toCharArray()) freq_s[c-'a']++;
        Node fast=head; //forward ptr
        Node slow=head; //backward ptr
 
        while(fast!=null)
         {
// if cur character is not present in string  then set slow and fast to next position of cur position
         
          char cur=fast.data;
          if(freq_s[cur-'a']==0) 
           {
            Arrays.fill(freq_node,0);
            fast=fast.next;
            slow=fast;
            continue;
           }
           
           
 //if cur char is present in string then increment the freq count of freq_node    
 
           freq_node[cur-'a']++;
           
// if cur char freq is greater than freq of str array. Then decrement window size by moving slow ptr ahead till they do not become equal.

          while(slow!=fast&&freq_node[cur-'a']>freq_s[cur-'a'])
          {
            freq_node[slow.data-'a']--;
            slow=slow.next;
          }
          
//if anagram found then store fast.next in an node(say next) , make fast.next null to break the link, add slow ptr to list and set slow and fast to next(name of fast.next ptr);       
          if(Arrays.equals(freq_node,freq_s))
          {
            Node next=fast.next;
            fast.next=null;
            al.add(slow);
            slow=next;
            fast=next;
            Arrays.fill(freq_node,0); //Reset the node array after we found an anagram
          }
          else fast=fast.next;
          
        }
        
        return al;
  }
}
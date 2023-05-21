class Solution
{
    boolean isPalindrome(Node head) 
    {
        List<Integer> l = new ArrayList<>();
        Node temp = head;
        while(temp!= null){
            l.add(temp.data);
            temp = temp.next;
        }
        int n = l.size()-1;
        for(int i = 0; i< l.size(); i++){
            if(l.get(i) != l.get(n-i)){
                return false;
            }
        }
        return true;
    }    
}
class Solution
{
    
    public ArrayList<String> permutation(String S)
    {
       ArrayList<String> al = new ArrayList<String>();
       int index = 0;
        Permutation(S,al,index);
        Collections.sort(al);
        return al;
    }
     
     
     void Permutation(String s, ArrayList<String> al, int index){
         
         
         if(index >= s.length()){
             al.add(s);
             return;
         }
         
         for(int j =index;j<s.length();j++){
             
             s = swap(s,index,j);
             Permutation(s, al, index + 1);
             s = swap(s, index, j);
             
         }
         
         
     }  
     
     public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
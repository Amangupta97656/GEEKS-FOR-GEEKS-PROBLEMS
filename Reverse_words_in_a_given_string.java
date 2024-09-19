class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
           
       String[] word = S.split("\\.");
        
        StringBuilder  revString =new StringBuilder("");
        for(int i=word.length-1;i>=0;i--)
        {
            revString.append(word[i]) ; 
            if(i>0)
            {
                revString.append(".");
            }
            
        }
        
        
        return revString.toString();
    }
}
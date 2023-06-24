class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
           if(k>str.length()){
             return 0;
             }
         int count=0;
        String str1="";
        for(int i=0;i<k;i++){
             str1+=str.charAt(i);
        }
        for(int  i=0;i<arr.length;i++){
            if(arr[i].startsWith(str1)){
                 count++;
                
            }}
        
            return count;
    }
}
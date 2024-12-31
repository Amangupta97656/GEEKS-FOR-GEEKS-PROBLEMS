class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int currentlength=1;
        int maxlength=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                currentlength++;
                
            }
            else if (arr[i]==arr[i-1])
               {
                    continue;
               }
               else{
                    maxlength=Math.max(maxlength,currentlength);
                    currentlength=1;
                }
                
                
            }
           maxlength=Math.max(maxlength,currentlength);
           return maxlength;
            
            
        
        
    }
}
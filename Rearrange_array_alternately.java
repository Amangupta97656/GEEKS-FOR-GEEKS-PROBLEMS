
class Solution{
    
   public static void rearrange(long arr[], int n){
        
        // Your code here
        long[] ans = new long[n];
        int i=0, j=n-1, flag = 0, k=0;
        while(i<=j){
            if(flag==0){
                ans[k++] = arr[j--];
                flag = 1;
            }
            else{
                ans[k++] = arr[i++];
                flag = 0;
            }
        }
        k=0;
        for(long num : ans){
            arr[k++] = num;
        }
    }
}

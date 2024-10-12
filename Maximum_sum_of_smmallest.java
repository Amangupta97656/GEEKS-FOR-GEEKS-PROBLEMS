class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        if(arr.length==1)return -1;
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            ans=Math.max(ans,arr[i]+arr[i+1]);
        }
        
        return ans;
    }
}
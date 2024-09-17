class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=k){
                max=Math.max(arr[i-1]+k,arr[n-1]-k);
                min=Math.min(arr[0]+k,arr[i]-k);
                ans=Math.min(ans,max-min);
            }
            else continue;
        }
        return ans;
        
    }
}
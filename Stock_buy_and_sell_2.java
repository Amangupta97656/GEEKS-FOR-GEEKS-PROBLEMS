class Solution {
    public static int stockBuyAndSell(int n, int[] arr) {
        int p = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                p+=arr[i]-arr[i-1];
            }
        }
        return p;
    }
}
class Solution {
    public static int dominantPairs(int n, int[] arr) {
        int mid = n/2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        int start = mid-1, end = n-1;
        int ans = 0;
        while(start >= 0 && end >= mid){
            if(arr[start] >= arr[end]*5){
                ans += end-mid+1;
                start--;
            } else {
                end--;
            }
        }
        return ans;
    }
}

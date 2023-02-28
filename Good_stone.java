class Solution {
    private static int[] dp;
    private static int solve(int[] arr,int n,int idx){
        if(idx < 0 || idx >= n) return 2; // 2 is for goodstones
        
        // if already visited then check 1 for loop & 2 for goods stons &return
        if(dp[idx] == 1 || dp[idx] == 2)
            return dp[idx];
        
        dp[idx] = 1;
        return dp[idx] = solve(arr,n,idx + arr[idx]);
    }
    public static int goodStones(int n, int[] arr) {
        dp = new int[n];
        for(int i=0; i<n; i++){
            if(dp[i] == 0){
                solve(arr,n,i);
            }
        }
        
        int count = 0;
        for(int ele : dp) if(ele == 2) count++;
        return count;
    }
}
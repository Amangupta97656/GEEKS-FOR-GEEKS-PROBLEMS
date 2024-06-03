class Solution {
    static int numberOfConsecutiveOnes(int n) {
        int MOD = 1_000_000_007;
        int[][] dp = new int[n + 1][3];
        dp[2][0] = 2;
        dp[2][1] = 1; 
        dp[2][2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            dp[i][1] = dp[i - 1][0];
            dp[i][2] = ((2 * dp[i - 1][2]) % MOD + dp[i - 1][1]) % MOD;
        }
        return dp[n][2];
    }
}
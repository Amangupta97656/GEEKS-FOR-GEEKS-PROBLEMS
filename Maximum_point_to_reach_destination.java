class Solution
{
    public int minPoints(int points[][],int m,int n) 
    { 
        // Your code goes here
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = Math.max(1, 1 - points[m - 1][n - 1]);
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - points[i][n - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            dp[m - 1][i] = Math.max(1, dp[m - 1][i + 1] - points[m - 1][i]);
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = Math.max(1, Math.min(dp[i + 1][j], dp[i][j + 1]) - points[i][j]);
            }
        }
        return dp[0][0];
    } 
}
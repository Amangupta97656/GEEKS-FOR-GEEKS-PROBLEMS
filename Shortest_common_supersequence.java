class Solution
{
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
{
        //Your code here
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return m + n - LCS(X, Y, m - 1, n - 1, dp);
}
    
public static int LCS(String s1, String s2, int i, int j, int[][] dp)
{
        if(i < 0 || j < 0) {
            return 0;
        }
        
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        if(s1.charAt(i) == s2.charAt(j)) {
            dp[i][j] = 1 + LCS(s1, s2, i - 1, j - 1, dp);
        }
        else {
            dp[i][j] = Math.max(LCS(s1, s2, i, j - 1, dp), LCS(s1, s2, i - 1, j, dp));
        }
        
        return dp[i][j];
}
}
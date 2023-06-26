class Solution{
    static int nCr(int n, int r)
    {
       if(r>n)
            return 0;
       int mod = 1000000007;
       int[][] dp = new int[n+1][n+1];
       for(int i = 0;i<=n;i++)
       {
           for(int j = 0;j<=n;j++)
           {
               if(i == j || j == 0)
               {
                   dp[i][j] = 1;
               }
           }
       }
       for(int i = 1;i<=n;i++)
       {
           for(int j = 1;j<i;j++)
           {
              dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%mod;
           }
       }
       return (dp[n][r])%mod;
    }
}
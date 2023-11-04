class Solution {
   public int editDistance(String s, String t) 
    {
        int  m=s.length(), n=t.length();
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<=n;i++)
        {
            dp[0][i]=i;
        }
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=i;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                }
            }
        }
        return dp[m][n];
    }


}
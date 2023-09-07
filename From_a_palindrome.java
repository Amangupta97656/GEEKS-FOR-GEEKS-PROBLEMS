class Solution{
    static int countMin(String str)
    {
        // code here
        int n = str.length();
        int dp[][] = new int[n+1][n+1];
        
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String rev = sb.toString();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return n - dp[n][n];
        
    }
}
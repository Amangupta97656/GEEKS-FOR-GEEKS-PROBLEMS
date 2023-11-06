class Solution{

    int longestCommonSubstr(String S1, String S2, int n, int m){

        // code here

        int ans=Integer.MIN_VALUE;

        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<=n;i++){

        for(int j=1;j<=m;j++){

         if(S1.charAt(i-1)==S2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];

         ans=Math.max(ans,dp[i][j]);

        }

        }

       return ans;

    }

}
class Solution 
{ 
      //Function to return max ' value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int[][] dp = new int[n+1][W+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {

                  dp[i][j] = -1;
            }

              
        }
        
        return knapSackRecursive(W, wt, val, n, dp);
    }
    
    static int knapSackRecursive(int W, int wt[], int val[], int n, int[][] dp) {
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        
        if (n == 0 || W == 0) {
            return 0;
        }
        
        if (wt[n-1] > W) {
            dp[n][W] = knapSackRecursive(W, wt, val, n-1, dp);
            return dp[n][W];
        }
        
        dp[n][W] = Math.max(val[n-1] + knapSackRecursive(W-wt[n-1], wt, val, n-1, dp),
                             knapSackRecursive(W, wt, val, n-1, dp));
        
        return dp[n][W];
    }
}


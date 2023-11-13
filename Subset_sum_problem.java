class Solution{
     static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean dp[][]=new boolean[N+1][sum+1];
        int i,j;
        for(i=0;i<N+1;i++){
            for(j=0;j<sum+1;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        }
        for(i=1;i<N+1;i++){
            for(j=1;j<sum+1;j++){
                if(arr[i-1]<=j)
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[N][sum];
    }
}
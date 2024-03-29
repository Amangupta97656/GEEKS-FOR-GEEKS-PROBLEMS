class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int a: arr){
            sum+=a;
        }
        if(sum%2!= 0) return 0;
        sum=sum/2;
        int[][] dp= new int[N+1][sum+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return fun(0, arr, sum, N,dp);
    }
    static int fun(int pos, int[] arr, int sum, int n,int[][] dp){
        if(sum==0) return 1;
        if(pos==n || sum<0) return 0;
        if(dp[pos][sum]!= -1){
            return dp[pos][sum];
        }
        return dp[pos][sum]=Math.max(fun(pos+1,arr,sum-arr[pos],n,dp),fun(pos+1,arr,sum,n,dp));
    }
}
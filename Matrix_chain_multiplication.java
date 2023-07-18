class Solution{
    static int mcm(int arr[],int i,int j,int dp[][])
    {
        if(i==j)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int cost1=mcm(arr,i,k,dp);
            int cost2=mcm(arr,k+1,j,dp);
            int cost3=arr[i-1]*arr[k]*arr[j];
            int finalcost=cost1+cost2+cost3;
            ans=Math.min(ans,finalcost);
            
        }
        return dp[i][j]=ans;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int a=mcm(arr,1,N-1,dp);
        return a;
    }
}
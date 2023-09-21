class Solution
{
    public int FindMaxSum(int arr[], int n)
    {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return maximizeLoot(arr,n-1,dp);
    }
    
    int maximizeLoot(int arr[],int i, int dp[]){
        if(i<0) return 0;
        
        if(dp[i] == -1){
            int pick= arr[i] + maximizeLoot(arr,i-2,dp);
            int notpick = maximizeLoot(arr,i-1,dp);
            return dp[i] = Math.max(pick,notpick);
        }
        return dp[i];
    }
    
}
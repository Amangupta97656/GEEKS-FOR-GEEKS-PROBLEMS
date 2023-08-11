class Solution {
    public long count(int coins[], int N, int sum) {
        long dp[] = new long [sum+1];
       dp[0] = 1 ;
       
       for(int i = 0 ; i < coins.length ; i++){
           for(int j = coins[i] ;  j < dp.length ; j++){
               dp[j] += dp[j - coins[i]] ;
           }
       }
       return dp[sum];
   
    }
}
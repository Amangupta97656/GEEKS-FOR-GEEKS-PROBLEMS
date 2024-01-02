
class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long dp[] = new long[(int) n+1];
        
        for(int i = (int) n-1 ; i >= 0 ; i-- ){
            dp[i] = Math.max(0 , a[i] + dp[i+1]);
        }
        
        long ans = (long)-1e9;
        long curSum = 0L;
        
        for(int i = 0 ; i < k ; i++){
            curSum += a[i];
        }
        
        for(int i = (int) k ; i < (int) n ; i++){
            
            long sum = curSum + dp[i];
            ans = Math.max(ans ,sum);
            
            curSum += a[i];
            curSum -= a[i - (int) k];
        }
        return Math.max(ans , curSum);
    }
}
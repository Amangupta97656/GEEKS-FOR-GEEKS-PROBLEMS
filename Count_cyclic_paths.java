class Solution{
	public static int countPaths(int N){
		 long dp[]=new long[2];

 dp[0]=1;

 long mod=((long)1e9)+7;

 for(int i=1;i<=N;i++)

 {

     long dp0=(dp[1]*3)%mod;

     long dp1=(dp[0]+dp[1]*2)%mod;

     dp[0]=dp0;

     dp[1]=dp1;

 }

 return (int)dp[0];

 }

}
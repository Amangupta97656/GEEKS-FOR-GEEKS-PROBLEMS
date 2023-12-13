class Solution {
    long countStrings(int n) {
        long mod = 1000000007;
        long dp_o[] = new long[n+1];
        long dp_z[] = new long[n+1];
        dp_o[1] = 1;
        dp_z[1] = 1;
        for(int i=2;i<=n;i++){
            dp_z[i] = (dp_o[i-1]+dp_z[i-1])%mod;
            dp_o[i] =  dp_z[i-1];
        }
        return (dp_z[n]+dp_o[n])%mod;
    }
}
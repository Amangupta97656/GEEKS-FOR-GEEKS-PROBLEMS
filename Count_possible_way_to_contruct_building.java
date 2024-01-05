

class Solution
{
    public int TotalWays(int N)
    {
        // Code here
        long mod =1000000007;
        if(N==1)    return 4;
        if(N==2)    return 9;
        
        long prev = 2, curr =3, ans =0;
        for(int i=3; i<=N; i++) {
            ans = (prev + curr)%mod;
            prev = curr;
            curr = ans;
        }
        return (int)(ans*ans % mod);
        
    }
    
}
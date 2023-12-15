class Solution
{
     public int nthPoint(int n)
    {
        int a=1,b=2;
        int mod=1000000007;
        if(n<3)
        {
            return n;
        }
        
        for(int i=3;i<=n;i++)
        {
            int temp=a;
            a=b%mod;
            b=(temp+a)%mod;
        }
        return b;
    }



class Solution
{
    public long PowMod(long x, long n, long m)
    {
        if(n == 0){
            return 1;
        }
        
        if(n == 1){
            return x;
        }
        
        long val = PowMod(x, n/2, m);
        val = (val * val) % m;
        
        if(n % 2 == 1){
            return (val * x) % m;
        }
        return val;
    }
}
class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        if(n == 1){
            long[] fib = {1};
            return fib;
        }
        
        long[] fib = new long[n];
        
        fib[0] = 1;
        fib[1] = 1;
        
        for(int i = 3;i<=n;i++)
            fib[i-1] = fib[i-3] + fib[i-2];
        
        return fib;
    }
}
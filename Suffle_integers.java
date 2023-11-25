class  Solution
{
    void shuffleArray(long a[], int n)
    {
        // Your code goes here
       int mod = 1001;
        for(int i = 0 ; i < n/2 ; i++)
        {
            a[2*i] += (a[i]%mod)*mod;
            a[2*i+1] += (a[i+n/2] % mod )*mod;
        }
        for(int i = 0 ; i < n ; i++)
            a[i] /= mod;
    }
}
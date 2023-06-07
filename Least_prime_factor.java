class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        int [] leastPrime = new int[n+1];
        leastPrime[0] = 0;
        leastPrime[1] = 1;
        // leastPrime[2] = 2;
        for(int i=2; i<=n; i++){
            if(leastPrime[i] == 0){
                int ind=1;
                int j=i;
                while(j*ind <= n){
                    j = j*ind;
                    ind++;
                    if(leastPrime[j] == 0) leastPrime[j] = i;
                    j= i;
                }
            }
        }
        return leastPrime;
    }
}
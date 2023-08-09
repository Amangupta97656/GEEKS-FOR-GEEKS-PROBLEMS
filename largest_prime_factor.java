class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        int maxi=Integer.MIN_VALUE;
        for(int i=2;i*i<=N;i++)
        {
            while(N%i==0)
            {
                N=N/i;
                maxi=Math.max(maxi,i);
            }
        }
        maxi=Math.max(maxi,N);
        return maxi;
    }
}
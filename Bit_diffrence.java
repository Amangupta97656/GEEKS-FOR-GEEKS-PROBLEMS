class Solution{
    static int countBits(int N, long A[])
    {
        long MAX = 1000000007L;
        long ans=0;
        for(int i=0;i<32;i++){
            //count of numbers with ith bit set
            long cnt=0;
            for(int j=0; j<N; j++){
             if( ( A[j] & (1<<i) ) != 0){
                 cnt++;
             }
            }
            //add (count of set bits * count of non set bits)
            //multiplying by 2 because every pair counted twice (1,3) (3,1)
            ans = (ans + (cnt) * (N-cnt) * 2) % MAX;
        }
        return (int)ans;
    }
}

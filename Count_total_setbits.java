class Solution {
    public static int maxpowerOftwo(long N){
        int x=0;
        while((1<<x) <= N) x++;
        return x-1;
    }
    public static long countBits(long N) {
        if(N ==0) return 0;
        long ans=0;
        int x = maxpowerOftwo(N);
        ans = x* (1<<(x-1)) + (N-(1<<x) +1 )+ countBits(N-(1<<x));
        return ans;
    }
}
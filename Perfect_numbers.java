class Solution {
    static int isPerfectNumber(long n) {
        
        if(n == 1) return 0;
        
        long sum = 1;
        
        for(long i = 2; i*i<=n;i++){
            
            if(n%i == 0) sum = sum + i +n/i;
        }
        
        if(sum == n) return 1;
        
        return 0;
        
    }
};
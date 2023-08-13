
class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n == 0) return 0;
        if(n == 1) return 1;
        int n1 = 0, n2 = 1;
        int ans = 0;
        for(int i=2; i<=n; i++)
        {
            ans = (n1 + n2) % 1000000007;
            n1 = n2 % 1000000007;
            n2 = ans;
        }
        return ans ;
    }
}
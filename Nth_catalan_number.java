class Solution {
    public static int findCatalan(int n) {
        if (n <= 1) {
            return 1;
        }
        
        int mod = (int) 1e9 + 7;
        int[] catalan = new int[n + 1];
        catalan[0] = catalan[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] = (catalan[i] + (int)((long)catalan[j] * catalan[i - j - 1] % mod)) % mod;
            }
        }
        
        return catalan[n];
    }
}
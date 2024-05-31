class Solution {
    static int swapNibbles(int n) {
        // code here
        
        int a = n % 16;
        int b = n / 16;
        
        return 16*a + b;
    }
}
class Solution {
     static int sumOfNaturals(int n) {
        int mod = (int)Math.pow(10, 9) + 7;
        long m = n;
        m %= mod;
        return (int)((m*(m+1)/2)  %  mod);
    }
}
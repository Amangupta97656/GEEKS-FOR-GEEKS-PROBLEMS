class Solution {
    int isDivisible(String s) {
    int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                evenSum += (s.charAt(i) - '0');
            } else {
                oddSum += (s.charAt(i) - '0');
            }
        }
        int delta = evenSum - oddSum;
        int ans = delta % 3 == 0 ? 1 : 0;
        return ans;
    }
}
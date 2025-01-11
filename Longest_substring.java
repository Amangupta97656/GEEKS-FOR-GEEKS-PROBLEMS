class Solution {
    public int longestUniqueSubstr(String s) {
        int res = 0, count = 0, left = 0, right = 0;
        while (right < s.length()) {
            while (
                (left < right) &&
                ((count & (1 << (s.charAt(right) - 'a'))) > 0)
            ) {
                count ^= 1 << (s.charAt(left) - 'a');
                left += 1;
            }
            
            count ^= 1 << (s.charAt(right) - 'a');
            res = Math.max(res, right - left + 1);
            right += 1;
        }
        return res;
    }
}
 
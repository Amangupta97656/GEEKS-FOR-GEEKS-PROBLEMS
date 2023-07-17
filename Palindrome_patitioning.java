class Solution{
   static int palindromicPartition(String str)
    {
             int N = str.length();
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return f(str, 0, N, dp) - 1;
    }
    
     private static int f(String s, int i, int end, int[] dp) {
        if (i == end) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];
        int minCost = Integer.MAX_VALUE;
        for (int j = i; j < end; j++) {
            if (isPalindrome(s, i, j)) {
                int cost = 1 + f(s, j + 1, end, dp);
                minCost = Math.min(minCost, cost);
            }
        }
        return dp[i] = minCost;
    }
    
      private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
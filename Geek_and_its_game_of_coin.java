class Solution {
    public static int findWinner(int n, int x, int y) {
        // Create a boolean array dp[].
        boolean[] dp = new boolean[n + 1];

        // Initialize dp[0], dp[x], dp[y] as true.
        dp[0] = false;
        if (x <= n) dp[x] = true;
        if (y <= n) dp[y] = true;

        // Fill rest of the entries in dp[] using recursive formula.
        for (int i = 1; i <= n; i++) {
            // If Geek cannot win game after removing 1, x or y coins.
            if ((i - 1 >= 0 && !dp[i - 1]) || (i - x >= 0 && !dp[i - x]) || (i - y >= 0 && !dp[i - y])) {
                dp[i] = true;
            }
        }

        // If dp[n] is true then Geek will win, otherwise Geek will not win.
        return dp[n] ? 1 : 0;
    }
}
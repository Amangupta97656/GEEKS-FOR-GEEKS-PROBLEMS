class Solution {
    static int maxGold(int n, int m, int M[][]) {
        int result = 0;

        int[][] dp = new int[n][m];

        for (int col = 0; col < m; col++) {
            for (int row = 0; row < n; row++) {
                if (col == 0) {
                    dp[row][col] = M[row][col];
                } else {
                    int a = (row - 1 >= 0) ? dp[row - 1][col - 1] : 0;
                    int b = dp[row][col - 1];
                    int c = (row + 1 < n) ? dp[row + 1][col - 1] : 0;

                    dp[row][col] = M[row][col] + Math.max(a, Math.max(b, c));
                }

                if (col == m - 1) {
                    result = Math.max(result, dp[row][col]);
                }
            }
        }

        return result;
    }
}
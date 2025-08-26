class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m = dimensions.length;
        int n = dimensions[0].length;
        int sum1 = 0;
        int max1 = 0;
        int prod1 = 1;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int k = i;
            for (int j = 0; j < n; j++) {
                sum1 += (int) Math.pow(dimensions[k][j], 2);
                prod1 *= dimensions[k][j];
            }
            if (sum1 > max1) {
                max = prod1;
                max1 = sum1;
            }
            if (sum1 == max1) {
                if (prod1 > max) {
                    max = prod1;
                }
            }
            prod1 = 1;
            sum1 = 0;
        }
        return max;
    }
}
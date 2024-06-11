class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        long sum = 0;

        
        int[][] diffs = new int[n][3];
        for (int k = 0; k < n; k++) {
            diffs[k][0] = Math.abs(arr[k] - brr[k]);
            diffs[k][1] = arr[k];
            diffs[k][2] = brr[k];
        }

        
        Arrays.sort(diffs, (a, b) -> b[0] - a[0]);

        int i = 0; 
        int j = 0; 

        for (int k = 0; k < n; k++) {
            int tipA = diffs[k][1];
            int tipB = diffs[k][2];

            if (tipA >= tipB) {
                if (i < x) {
                    sum += tipA;
                    i++;
                } else {
                    sum += tipB;
                    j++;
                }
            } else {
                if (j < y) {
                    sum += tipB;
                    j++;
                } else {
                    sum += tipA;
                    i++;
                }
            }
        }

        return sum;
    }

}
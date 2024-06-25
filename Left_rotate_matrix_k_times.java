class Solution {
    public static void reverse(int[] a, int s, int e) {
        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }

    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        k = k % mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            reverse(mat[i], 0, k - 1);
            reverse(mat[i], k, mat[i].length - 1);
            reverse(mat[i], 0, mat[i].length - 1);
        }
        return mat;
    }
}


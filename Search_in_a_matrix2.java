class Solution {
    // Function to search a given number in a row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;       // Number of rows
        int m = mat[0].length;    // Number of columns

        // Start from the top-right corner
        int i = 0, j = m - 1;
        
        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                return true; // Found the element
            } else if (mat[i][j] > x) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        return false; // Element not found
    }
}

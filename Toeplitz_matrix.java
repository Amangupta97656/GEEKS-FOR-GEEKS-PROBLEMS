class Solution {
    /*You are required to complete this method*/
   boolean isToeplitz(int mat[][]) {
        // Your code here
        for(int r=1; r<mat.length; r++){
            for(int c=1; c<mat[0].length; c++){
                if(mat[r][c] != mat[r-1][c-1]) return false;
            }
        }
        return true;
    }
}
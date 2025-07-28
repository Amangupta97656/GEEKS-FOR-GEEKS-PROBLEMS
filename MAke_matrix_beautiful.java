class Solution {
    public static int balanceSums(int[][] mat) {
        int maxRowSum=0;
        int maxColumSum=0;
        int matrixSum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            int imaxRowSum=0;
            int imaxColumSum=0;
            for(int j=0;j<n;j++){
                matrixSum+=mat[i][j];
                imaxRowSum+=mat[i][j];
                imaxColumSum+=mat[j][i];
            }
            maxRowSum=Math.max(maxRowSum,imaxRowSum);
            maxColumSum=Math.max(maxColumSum,imaxColumSum);
        }
        int max=Math.max(maxRowSum,maxColumSum);
        return (max*n)-matrixSum;
    }
}


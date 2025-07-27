class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        if(mat==null||mat.length==0||mat[0].length==0)
        return;
        
        int m = mat.length;
        int n = mat[0].length;
        
        boolean[] hasZeroInRow = new boolean[m];
        boolean[] hasZeroInCol = new boolean[n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    hasZeroInRow[i] = true;
                    hasZeroInCol[j] = true; 
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            if(hasZeroInRow[i]==true)
            for(int j=0;j<n;j++)
            mat[i][j] = 0;
        }
        
        for(int i=0;i<n;i++)
        {
            if(hasZeroInCol[i])
            for(int j=0;j<m;j++)
            mat[j][i] = 0;
        }
    }
}
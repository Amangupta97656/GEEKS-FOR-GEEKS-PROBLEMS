class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int n=matrix.length;
        //int m=matrix[0].length;
        int[] ans=new int[n*n];
        int pos=0;
        for(int i=0;i<n;i++){
            int row=0,col=i;
            while(col>=0){
                ans[pos]=matrix[row][col];
                row++;
                col--;
                pos++;
            }
        }
        
        for(int i=1;i<n;i++){
            int row=i;
            int col=n-1;
            while(row<n){
                ans[pos]=matrix[row][col];
                row++;
                col--;
                pos++;
            }
        }
    
    return ans;
    }
}
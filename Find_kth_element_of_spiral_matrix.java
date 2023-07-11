class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
    // Your code here
       int startRow=0, startCol=0, endRow=n-1, endCol=m-1,indx=0;
       int arr[]= new int [n*m];
       while(startRow <= endRow && startCol<=endCol &&indx<=k){
           //top
           for(int j=startCol ;j<=endCol;j++){
               arr[indx]=A[startRow][j];
               indx++;
           }
           // right
           for(int i=startRow+1;i<=endRow;i++){
               arr[indx]=A[i][endCol];
               indx++;
           }
           
           //bottom
           for(int j=endCol-1;j>=startCol;j--){
               if(startRow==endRow){
                   break;
               }
               arr[indx]=A[endRow][j];
               indx++;
           }
           
           //left
           for(int i=endRow-1;i>=startRow+1;i--){
               if(startCol==endCol){
                   break;
               }
               arr[indx]=A[i][startRow];
               indx++;
           }
           startRow++;
           startCol++;
           endCol--;
           endRow--;
       }
       return arr[k-1];
    }
}
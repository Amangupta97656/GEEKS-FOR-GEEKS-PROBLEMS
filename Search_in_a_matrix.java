class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int row = mat.length , i = 0 ,j = mat[0].length-1;
        while(i < row && j>=0){
            if(mat[i][j] == x){
                return true;
            }else if(mat[i][j]>x){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
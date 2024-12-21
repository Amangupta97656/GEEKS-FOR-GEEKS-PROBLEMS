class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int mat[][]) {
        // code here
        int n = mat.length;
        
        for(int i = 0; i<n;i++){
            int j = 0;
            int k = n -1;
            while(j<k){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
                j++;
                k--;
            }
        }
        for(int i = 0; i<n;i++){
            for(int j=i;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
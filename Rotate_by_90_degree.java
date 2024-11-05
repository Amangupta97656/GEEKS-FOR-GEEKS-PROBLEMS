class GFG {
    static void rotate(int mat[][]) {
    int a1 = mat.length;
    int a2 = mat[0].length;
    int arr[][] = new int[a1][a2];
    int end=a2-1;
    for(int i =0;i<a1;i++){
        end = a2-1;
        for(int j = 0;j<a2;j++){
            arr[i][j] = mat[end][i];
            end--;
        }
        
    }
    for(int i = 0;i<a1;i++){
        for(int j = 0;j<a2;j++){
            mat[i][j] = arr[i][j];
        }
    }
    
    
    }
}
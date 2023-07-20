class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return SolveSudoku2(grid,0,0);
    }
    
    public static boolean SolveSudoku2(int grid[][],int row,int col){
        
        //base case
        if(row==9 ){
            return true;
        }
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
        nextRow=row+1;
        nextCol=0;
    }
    
    if(grid[row][col]!=0){
        
        return SolveSudoku2(grid,nextRow,nextCol);
    }
    else{
    for(int digit=1;digit<=9;digit++){
        if(isSafe(grid,row,col,digit)){
            grid[row][col]=digit;
            
            if(SolveSudoku2(grid,nextRow,nextCol)){
                return true;
            }
            grid[row][col]=0;//backtrack
            
        }
    }
    }
    return false;
    
    }
    //issafe functio-checking condition
    public static boolean isSafe(int grid[][],int row ,int col,int digit){
        
        //need to check three condition 
        
        //1>>>>col wise
        for(int i=0;i<=8;i++){
            if(grid[i][col]==digit){
                return false;
            }
        }
        //2>>>>row wise
        for(int j=0;j<=8;j++){
            if(grid[row][j]==digit){
                return false;
            }
        }
        //2>>>>in its 3x3 grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(grid[i][j]==digit){
                    return false;
                }
            }
        }
    return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}
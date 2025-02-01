class Solution {
    
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited; // visited cells
    
    // backTrack from cell (i,j) 
    static public boolean backTrack(char[][] mat, int i , int j , String word , int index) {
        if(index == word.length()) return true; // if reached end of string , ie formed word
        
        // if (i,j) goes OUT OF BOUNDS of grid OR
        // (i,j) DOES NOT match with word[index] ( ie next character in word) OR
        // (i,j) is ALREADY visited 
        if(i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || word.charAt(index) != mat[i][j] || visited[i][j] == true ) return false;
        
        visited[i][j] = true; // mark (i,j) as visited
        // go 4-directionally from (i,j) to see if we find a path for our target word
        boolean ans =  
                   backTrack(mat , i + dx[0] , j + dy[0] , word , index + 1) ||
                   backTrack(mat , i + dx[1] , j + dy[1] , word , index + 1) ||
                   backTrack(mat , i + dx[2] , j + dy[2] , word , index + 1) ||
                   backTrack(mat , i + dx[3] , j + dy[3] , word , index + 1);

        visited[i][j] = false; // mark (i,j) as false when bactrack returns
        return ans;
    }
    
    
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int rows = mat.length;
        int cols = mat[0].length;
        visited = new boolean[rows][cols]; // visited array
        
        // try forming word from each (i,j) cell 
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                if(backTrack(mat , i , j , word , 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }
} 
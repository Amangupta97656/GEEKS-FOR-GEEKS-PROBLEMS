class Solution{
     int countoc = 0;
    public int findOccurrence(char mat[][], String target){
         int m = mat.length; 
         int n = mat[0].length;
         boolean vis [][] = new boolean[m][n];
         for(int r = 0; r< m; r++){
             for(int c = 0; c < n; c++){
                 if(mat[r][c] == target.charAt(0)) countoc += find(mat,target,vis,r,c,0);
             }
         }
         return countoc;
    }
    int find(char mat[][],String word, boolean vis[][],int r, int c, int index){
            if(r < 0 || c < 0 || r == vis.length || c == vis[0].length || vis[r][c] || word.charAt(index) != mat[r][c]) return 0;
            if(index == word.length()-1) return 1; 
            vis[r][c] = true;
            int top  = find(mat,word,vis,r-1,c,index+1);
            int down = find(mat,word,vis,r+1,c,index+1);
            int right= find(mat,word,vis,r,c+1,index+1);
            int left = find(mat,word,vis,r,c-1,index+1);
            vis[r][c] = false;
            return top + down + right + left;    
    }
}
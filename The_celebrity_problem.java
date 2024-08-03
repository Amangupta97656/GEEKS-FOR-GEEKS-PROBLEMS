class Solution {
    public int celebrity(int[][] mat) {
        int n = mat.length, j = 0;
      // j= 0 , means assuming first person as celebrity
        for(int i=0;i<n;i++){
      // if j knows i , means that i might be the celebrity 
            if(knows(mat, j , i)) j = i;
        }
       // j is celebrity only if j does not know i or every other person know j
        for(int i=0;i<n;i++){
            if(j != i && (knows(mat, j, i) || !knows(mat, i, j))) return -1;
        }
        return j;
    }
   // to check whether a knows b or not
    private boolean knows(int[][] m, int a, int b){
        return m[a][b] == 1;
    }
}
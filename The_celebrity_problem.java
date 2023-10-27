class Solution
{ 
   int celebrity(int M[][], int n) {
        int x = 0;
        int y = n - 1; 
    
        while (x < y) { 
            if (M[x][y] == 1) {
                x++;
            } else {
                y--;
            }
        }
    
       
        for (int i = 0; i < n; i++) {
            if (i != x) {
                if (M[x][i] == 1 || M[i][x] == 0) {
                    return -1;
                }
            }
        }
    
        return x;
    }
}
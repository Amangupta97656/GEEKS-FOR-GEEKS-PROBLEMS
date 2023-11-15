class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        boolean visited [][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0 ; i < grid.length ;i++)
        {
            for(int j = 0; j <grid[0].length; j++)
            {
                if(grid[i][j] == '1' && visited[i][j]== false)
                {
                    drawTree(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
        }
        public static void drawTree(char [][] arr,int i, int j ,boolean[][] visited)
        {
            if(i < 0  || j < 0 || i >= arr.length || j  >= arr[0].length || arr[i][j] == '0' || visited[i][j] == true)
            return;
            
            visited[i][j] = true;
            drawTree(arr,i + 1,j,visited);
            drawTree(arr,i - 1,j,visited);
            drawTree(arr,i ,j + 1,visited);
            drawTree(arr,i,j - 1,visited);
            drawTree(arr,i + 1,j + 1,visited);
            drawTree(arr,i - 1,j - 1,visited);
             drawTree(arr,i - 1,j + 1,visited);
              drawTree(arr,i + 1,j - 1,visited);
        }
}
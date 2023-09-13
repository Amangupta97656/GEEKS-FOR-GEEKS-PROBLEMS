class Solution {

    public static final int[] dirX = {-1,1,0,0};

    public static final int[] dirY = {0,0,-1,1};

    static boolean isSafe(int[][]grid, int row, int col){

        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){

          return false;  

        }

        return true;

    }

    static int shotestPath(int[][] mat, int n, int m, int k) {

        // code here

        boolean[][][] visited = new boolean[n][m][k+1];

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{0,0,0,k});

        visited[0][0][k] = true;

        while(!queue.isEmpty()){

            int[] curPos = queue.poll();

            if(curPos[0] == n - 1 && curPos[1] == m - 1){

                return curPos[2];

            }

            for(int dir = 0;dir < 4; dir++){

                int newX = curPos[0] + dirX[dir];

                int newY = curPos[1] + dirY[dir];

                int newK = curPos[3];

                if(!isSafe(mat, newX, newY)){

                    continue;

                }

                if(mat[newX][newY] == 0 && !visited[newX][newY][newK]){

                    queue.add(new int[]{newX, newY, curPos[2] + 1,newK});

                    visited[newX][newY][newK] = true;

                }

                else if(newK > 0 && !visited[newX][newY][newK-1]){

                    queue.add(new int[]{newX, newY, curPos[2] + 1, newK - 1});

                    visited[newX][newY][newK - 1] = true;

                }

            }

            

        }

        return -1;

    }

};

 
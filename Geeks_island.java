class Solution{

 int water_flow(int [][] mat, int N, int M) {

 //Write your code here

 boolean[][] indVisited = new boolean[N][M];

 boolean[][] arbVisited = new boolean[N][M];

 for(int j=0; j<M; j++){

     if(!indVisited[0][j]){

         dfs(indVisited,mat,0,j);

     }

     if(!arbVisited[N-1][j]){

         dfs(arbVisited,mat,N-1,j);

     }

 }

 for(int i=0; i<N; i++){

     if(!indVisited[i][0]){

         dfs(indVisited,mat,i,0);

     }

     if(!arbVisited[i][M-1]){

         dfs(arbVisited,mat,i,M-1);

     }

 }

 int count = 0;

 for(int i=0; i<N; i++){

     for(int j=0; j<M; j++){

         if(indVisited[i][j] && arbVisited[i][j])

           count++;

     }

 }

 return count;

 }
 void dfs(boolean[][] visited,int[][] mat,int i,int j){

     int m = mat.length, n = mat[0].length;

     int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};

     Queue<int[]> q = new LinkedList<>();

     q.offer(new int[]{i,j});

     visited[i][j] = true;

     while(!q.isEmpty()){

         int[] curr = q.poll();

         int currNum = mat[curr[0]][curr[1]];

         for(int[] dir : direction){

             int x = dir[0] + curr[0];

             int y = dir[1] + curr[1];

             if(validIdx(x,y,m,n) && !visited[x][y] && mat[x][y]>=currNum){

                 visited[x][y] = true;

                 q.offer(new int[]{x,y});

             }

         }

     }

     return;

 }

 

 boolean validIdx(int x,int y,int m,int n){

     return (x>=0 && x<m && y>=0 && y<n) ? true : false;

 }

}
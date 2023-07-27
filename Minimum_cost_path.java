class Solution
{
    //Function to return the minimum cost to react at bottom
	//right cell from top left cell.
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        int n=grid.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        
        int[][] distance=new int[n][n];
        for(int[] r:distance) Arrays.fill(r,(int)1e9);
        
        pq.offer(new int[]{grid[0][0],0,0});
        
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,1};
        
        while(!pq.isEmpty()){
            int[] temp=pq.poll();
            int wt=temp[0],row=temp[1],col=temp[2];
            
            if(row==n-1 && col==n-1) break;
            
            for(int k=0;k<4;k++){
                int nrow=row+dr[k];
                int ncol=col+dc[k];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<n && distance[nrow][ncol]>wt+grid[nrow][ncol]){
                    distance[nrow][ncol]=wt+grid[nrow][ncol];
                    pq.offer(new int[]{distance[nrow][ncol],nrow,ncol});
                }
            }
        }
        return distance[n-1][n-1];
    }
}
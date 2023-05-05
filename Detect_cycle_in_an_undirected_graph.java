class pair{
    int first;
    int sec;
    
    pair(int first, int sec){
        this.first = first;
        this.sec = sec;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
      
        boolean visited[] = new boolean[V];
        
          
          for(int i = 0 ; i < V; i++){
              
                  if(!visited[i]){
                     
                      if(BFS(adj, visited, i, V))
                      return true;
                  }
              
          }
          
          return false;
  
    }
    
    public static boolean BFS( ArrayList<ArrayList<Integer>> adj,  boolean visited[], 
    int node, int V){
        visited[node] = true;
        Queue<pair> pq = new LinkedList<>();
        pq.add(new pair(node, -1));
        
        
        while(!pq.isEmpty()){
            int n = pq.peek().first;
            int parent = pq.peek().sec;
            
            pq.remove();
            
            for(int adjNode : adj.get(n)){
                if(!visited[adjNode]){
                    visited[adjNode] = true;
                    pq.add(new pair(adjNode, n));
                }
                else if(parent != adjNode){
                    return true;
                }
            }
        }
        
        return false;
        
        
    }
}
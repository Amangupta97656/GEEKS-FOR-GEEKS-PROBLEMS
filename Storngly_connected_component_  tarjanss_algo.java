
class Solution
{
    public ArrayList<ArrayList<Integer>> tarjans(int V, ArrayList<ArrayList<Integer>> adj) 
    {
      Stack<Integer> st = new Stack<>();
      boolean[] visited = new boolean[V];
      
      for(int i = 0; i<V; i++){
          if(!visited[i]){
            dfs(st, adj, visited, i);   
          }
           
      }
      
      Map<Integer, List<Integer>> transpose = new HashMap<>();
      for(int i = 0; i<adj.size(); i++){
          visited[i] = false;
          for(int j : adj.get(i)){
              transpose.put(j, transpose.getOrDefault(j, new ArrayList()));
              transpose.get(j).add(i);
          }
      }
      
      ArrayList<ArrayList<Integer>> scc = new ArrayList<>();    
      while(!st.isEmpty()){
          int ele = st.pop();
          if(!visited[ele]){
              ArrayList<Integer> temp = new ArrayList<>();
              revDfs(visited, temp, transpose, ele);
              Collections.sort(temp);
              scc.add(temp);
              
          }
          
      }
      Collections.sort(scc,(a,b)->a.get(0)- b.get(0));
      return scc;
      
    
    }
    
    
    public void revDfs(boolean[] visited,  ArrayList<Integer> temp,Map<Integer, List<Integer>> transpose, int node  ){
        visited[node] = true;
        temp.add(node);
        if(transpose.get(node) == null){
            return;
        }
        for(int nbr: transpose.get(node)){
           // System.out.println("!!"+nbr);
            if(!visited[nbr]){
                revDfs(visited, temp, transpose, nbr);
            }
        }
    }
    
    
    public void dfs(Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int node){
        visited[node] = true;
        for(int nbr: adj.get(node)){
            if(!visited[nbr]){
                    dfs(st, adj, visited, nbr);  
            }
        }
        st.push(node);
      
    }
}
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[v];
        boolean stack[]=new boolean[v];
        
        for(int i=0; i<v; i++){
            if(!vis[i]){
                if(isCyclicUtil(v,adj,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isCyclicUtil(int v, ArrayList<ArrayList<Integer>> adj,int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;
        
        for(int i=0; i<adj.get(curr).size(); i++){
            int e=adj.get(curr).get(i);
            if(stack[e]){
                return true;
            }
            if(!vis[e] && isCyclicUtil(v,adj,e,vis,stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
}
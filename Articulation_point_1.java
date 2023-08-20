class Solution
{
    //Function to return Breadth First Traversal of given graph.
    private int timer=0;
    public ArrayList<Integer> articulationPoints(int V,ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean[] vis=new boolean[V];
        int[] tin=new int[V];
        int[] low=new int[V];
        int mark[]=new int[V];
        for(int i=0;i<V;i++){
            dfs(0,-1,tin,low,vis,mark,adj);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(mark[i]==1){
                ans.add(i);
            }
        }
        if(ans.size()==0)ans.add(-1);
        return ans;
    }
    void dfs(int node,int par,int[] tin,int[] low,boolean[] vis,int[] mark,ArrayList<ArrayList<Integer>> adj){
         vis[node]=true;
         tin[node]=low[node]=timer++;
         int child=0;
         for(int it:adj.get(node)){
             if(it==par)continue;
             if(!vis[it]){
                 dfs(it,node,tin,low,vis,mark,adj);
                 low[node]=Math.min(low[node],low[it]);
                 if(low[it]>=tin[node] && par!=-1){
                     mark[node]=1;
                 }
                 child++;
             }
             else{
                 low[node]=Math.min(low[node],tin[it]);
             }
         }
         if(child>1 && par==-1)mark[node]=1;
    }
}
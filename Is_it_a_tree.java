class Solution {
    public boolean isCyclePresent(int node,List<List<Integer>> adj,Set<Integer> vis,int p){
        vis.add(node); 
        for(int i:adj.get(node)){
            if(!vis.contains(i)){
                if(!isCyclePresent(i,adj,vis,node)) return false;
            }
            else if(p!=i) return false;
        }
        return true;
    }
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        // code here
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(ArrayList<Integer> e:edges){
            adj.get(e.get(0)).add(e.get(1));
            adj.get(e.get(1)).add(e.get(0));
        } 
        Set<Integer> vis=new HashSet<>();
        boolean b=isCyclePresent(0,adj,vis,-1);
        if(vis.size()!=n) return false;
        return b;
    }
}
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)    list.add(new ArrayList<>());
        for(int e[]:edges){
            list.get(e[0]).add(e[1]);
            list.get(e[1]).add(e[0]);
        }
        
        
        int ans[] = new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src]=0;
        
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        
        while(!q.isEmpty()){
            Integer node = q.remove();
            int dist = ans[node];
            
            for(Integer nbr:list.get(node)){
                if(ans[nbr]>dist+1){
                    ans[nbr]=dist+1;
                    q.add(nbr);
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(ans[i]==Integer.MAX_VALUE)   ans[i]=-1;
        }
        return ans;
    }
}
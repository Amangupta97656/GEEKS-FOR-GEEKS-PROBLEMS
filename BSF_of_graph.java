class Solution {
   
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
         
         
         boolean []vis=new boolean[V];
         LinkedList<Integer>Q=new LinkedList<>();
         ArrayList<Integer>arr=new ArrayList<>();
         
         vis[0]=true;
         Q.add(0);
         
         while(!Q.isEmpty()){
             int x=Q.poll();
             arr.add(x);
             
             for(int y:adj.get(x)){
                 if(!vis[y]){
                     vis[y]=true;
                     Q.add(y);
                 }
             }
         }
         return arr;
    }
}
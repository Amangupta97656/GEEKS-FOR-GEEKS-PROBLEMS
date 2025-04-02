class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        boolean[] vis = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int top = q.poll();
            ans.add(top);
            for (Integer neigh : adj.get(top)) {
                if (!vis[neigh]) {
                    vis[neigh] = true;
                    q.offer(neigh);
                }
            }
        }
        return ans;
    }
}
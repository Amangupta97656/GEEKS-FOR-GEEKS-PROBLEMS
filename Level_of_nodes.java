class Solution
{
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int x)
    {
        // code here
      Queue<Integer> q = new LinkedList<>();
      boolean vis[] = new boolean[V];
      q.add(0);
      vis[0] = true;
    
      int level = 0;

    while (!q.isEmpty()) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int a = q.remove();
            if (a == x)
                return level;

            for (int j = 0; j < adj.get(a).size(); j++) {
                int arb = adj.get(a).get(j);
                if (!vis[arb]) {
                    vis[arb] = true;
                    q.add(arb);
                }
            }
        }
        level++;
        }
        return -1;
    }


}
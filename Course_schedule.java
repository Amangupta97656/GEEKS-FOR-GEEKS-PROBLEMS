import java.util.*;

class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]); // y → x
        }

        // Step 2: Compute indegree
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            for (int it : adj.get(i))
                indegree[it]++;
        }

        // Step 3: Queue for Kahn’s algorithm
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0)
                    q.add(it);
            }
        }

        // Step 4: Check for cycle (if all nodes are processed)
        if (topo.size() == n)
            return topo;

        // Else, return empty list (cycle detected)
        return new ArrayList<>();
    }
}
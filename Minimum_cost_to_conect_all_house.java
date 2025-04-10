class Solution {

    public int minCost(int[][] houses) {
        // code here
        
   int n = houses.length;
        List<int[]> edges = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = Math.abs(houses[i][0] - houses[j][0]) + Math.abs(houses[i][1] - houses[j][1]);
                edges.add(new int[] {i, j, cost});
            }
        }

        edges.sort((a, b) -> a[2] - b[2]);
        
        UnionFind uf = new UnionFind(n);
        int minCost = 0;
        int edgesUsed = 0;

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], cost = edge[2];
            if (uf.find(u) != uf.find(v)) {
                uf.union(u, v);
                minCost += cost;
                edgesUsed++;
            }
            if (edgesUsed == n - 1) {
                break;
            }
        }
        
        return minCost;
    }
}

class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}
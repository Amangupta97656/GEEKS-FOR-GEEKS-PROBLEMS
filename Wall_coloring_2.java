class Solution{
    int findMin(int[][]costs, int index, int parent, int K, int N, int[][]dp){
        if(index == N){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k = 0; k < K; k++){
            if(k == parent){
               continue;
            }
            int cost = 0;
            if(dp[index][k] == -1){
                cost = dp[index][k] = costs[index][k] + findMin(costs, index + 1, k, K, N, dp);
                min = Math.min(cost, min);
            }else{
                min = Math.min(min, dp[index][k]);
            }
        }
        return min;
    }
    int minCost(int [][] costs) {
        int n = costs.length;
		int k = costs[0].length;
		int[][]dp = new int[n][k];
        for(int row[] : dp){
            Arrays.fill(row,-1);
        } 
		int ans = findMin(costs, 0, -1, k, n, dp);
		return ans <= 0? -1 : ans;
    }
}
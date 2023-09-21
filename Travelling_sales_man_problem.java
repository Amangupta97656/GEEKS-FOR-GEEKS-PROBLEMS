class Solution
{
     public int getMinDistance(int mask, int currentCity, int[][] dp, int[][] distance)
    {
        int n = distance.length;

        // All cities being visited.
        if (mask == (1 << n) - 1)
        {
            return distance[currentCity][0];
        }

        // If the current state (mask, currentCity) is visited before.
        if (dp[mask][currentCity] != -1)
        {
            return dp[mask][currentCity];
        }

        int ans = Integer.MAX_VALUE;

        // Trying for every possible city and computing the shortest possible route.
        for (int city = 0; city < n; city++)
        {
            if ((mask & (1 << city)) == 0)
            {
                int tmpAns = distance[currentCity][city] + getMinDistance(mask | (1 << city), city, dp, distance);
                ans = Math.min(ans, tmpAns);
            }
        }

        // Memorizing and return the ans.
        return dp[mask][currentCity] = ans;
    }
    
    public int total_cost(int[][] distance)
    {
        int n = distance.length;

        int[][] dp = new int[(1 << n) + 1][n + 1];
        for(int i = 0; i < (1<<n)+1; i++){
            for(int j = 0; j < n+1; j++){
                dp[i][j] = -1;
            }
        }

        // Return the ans returned by getMinDistance.
        return getMinDistance(1, 0, dp, distance);    
    }
}
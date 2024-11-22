class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n = prices.length;
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 1;i<n;i++)
        {       
                buy = Math.min(buy,prices[i-1]);
                profit = Math.max(profit,prices[i]- buy);
                
                
        }
        return profit;
    }
}

.
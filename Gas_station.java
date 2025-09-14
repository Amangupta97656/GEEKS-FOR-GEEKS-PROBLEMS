class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
    
        int totalGas = 0, totalCost = 0;
        int start = 0, tank = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return (totalGas < totalCost) ? -1 : start;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] gas1 = {4, 5, 7, 4};
        int[] cost1 = {6, 6, 3, 5};
        System.out.println(sol.startStation(gas1, cost1)); // Output: 2

        int[] gas2 = {3, 9};
        int[] cost2 = {7, 6};
        System.out.println(sol.startStation(gas2, cost2)); // Output: -1  
     }
}
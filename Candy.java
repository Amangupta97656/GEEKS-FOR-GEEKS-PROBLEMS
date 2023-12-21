class Solution {
    static int minCandy(int N, int ratings[]) {
        if (N == 0) {
            return 0;
        }

        int[] candies = new int[N];
        Arrays.fill(candies, 1); // Each child must have at least one candy

        // Traverse from left to right
        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Traverse from right to left
        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate the total number of candies needed
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}
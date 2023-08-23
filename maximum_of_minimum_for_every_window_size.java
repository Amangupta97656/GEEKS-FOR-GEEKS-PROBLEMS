class Solution {
    // Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) {
        // Initialize arrays to store left and right boundaries for each element.
        int[] leftBoundaries = new int[n];
        int[] rightBoundaries = new int[n];
        Arrays.fill(leftBoundaries, -1);
        Arrays.fill(rightBoundaries, n);

        // Stack to store indices of elements to calculate left and right boundaries.
        Stack<Integer> stack = new Stack<>();

        // Calculate left boundaries for each element.
        for (int i = 0; i < n; i++) {
            while ((!stack.isEmpty()) && arr[stack.peek()] >= arr[i])
                stack.pop();

            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                leftBoundaries[i] = stack.peek();
                stack.push(i);
            }
        }

        // Clear the stack for calculating right boundaries.
        stack.clear();

        // Calculate right boundaries for each element.
        for (int i = n - 1; i >= 0; i--) {
            while ((!stack.isEmpty()) && arr[stack.peek()] >= arr[i])
                stack.pop();

            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                rightBoundaries[i] = stack.peek();
                stack.push(i);
            }
        }

        // Calculate the minimum element's index within each window size.
        int[] minIndexWithinWindow = new int[n];
        Arrays.fill(minIndexWithinWindow, 0);
        for (int i = 0; i < n; i++) {
            minIndexWithinWindow[i] = (leftBoundaries[i] == -1) ? rightBoundaries[i] : rightBoundaries[i] - leftBoundaries[i] - 1;
        }

        // Initialize the answer array to store the maximum of minimums for each window size.
        int[] maxOfMins = new int[n];

        // Find the minimum element in the array.
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }

        // Calculate the maximum of minimums for each window size.
        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            maxOfMins[minIndexWithinWindow[i] - 1] = Math.max(maxOfMins[minIndexWithinWindow[i] - 1], currentElement);
        }

        // Update the last element of the answer array with the overall minimum.
        maxOfMins[n - 1] = min;

        // Calculate the final result by finding the maximum in a window.
        for (int i = n - 2; i >= 0; i--) {
            maxOfMins[i] = Math.max(maxOfMins[i], maxOfMins[i + 1]);
        }

        return maxOfMins;
    }
}
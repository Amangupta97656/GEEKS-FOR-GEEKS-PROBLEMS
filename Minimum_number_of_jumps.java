class Solution {
    static int minJumps(int[] arr) {
        if (arr.length <= 1) {
            return 0;           // If array has only one element, no jumps are needed
        }
        if (arr[0] == 0) {
            return -1;          // If the first element is 0, can't move forward
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);  // Update the farthest point reachable
            if (i == currentEnd) {                      // Reached the end of the range for the current jump
                jumps++;
                currentEnd = farthest;                  // Update currentEnd to the farthest point reachable
                if (currentEnd >= arr.length - 1) {
                    return jumps;                       // If currentEnd reaches or exceeds the last index, return the jumps
                }
            }
        }
        return -1;
    }
}
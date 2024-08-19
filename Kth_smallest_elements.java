class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        int max = 1000000; // Given constraints: 1<=arr[i]<=10^6

        int cnt[] = new int[max+1];  // Step 1

        for(int num : arr) {   // Step 2
            cnt[num]++;
        }

        int cumCount = 0;    
        for(int i=1; i<=max; i++) {    // Step 3
            cumCount += cnt[i];
            if (cumCount >= k) {
                return i;
            }
        }
        return -1; // Just in case things go south
    }
}
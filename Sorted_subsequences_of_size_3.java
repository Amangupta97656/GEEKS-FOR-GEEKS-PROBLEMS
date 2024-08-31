class Solution {
    /**
     * This method finds the first element in the array that has a smaller element on its left and a larger element on its right.
     * It returns a list containing the left smaller element, the element itself, and the right larger element.
     *
     * @param arr the input array of integers
     * @return a list of integers containing the left smaller element, the element itself, and the right larger element
     */
    public List<Integer> find3Numbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int[] lr = new int[n]; // Array to store the left smaller elements
        int[] rl = new int[n]; // Array to store the right larger elements
        
        // Initialize the left smaller array
        lr[0] = -1;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            if (min < arr[i]) {
                lr[i] = min;
            } else {
                lr[i] = -1;
            }
        }
        
        // Initialize the right larger array
        rl[n - 1] = -1;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            if (max > arr[i]) {
                rl[i] = max;
            } else {
                rl[i] = -1;
            }
        }
        
        // Find the first element with a smaller left and larger right
        for (int i = 1; i < n - 1; i++) {
            if (lr[i] != -1 && rl[i] != -1) {
                ans.add(lr[i]);
                ans.add(arr[i]);
                ans.add(rl[i]);
                break;
            }
        }
        
        return ans;
    }
}
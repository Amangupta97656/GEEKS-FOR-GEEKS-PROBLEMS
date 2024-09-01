class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        // Traverse both arrays simultaneously
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum1 += arr1.get(i++);
            } 
            else if (arr1.get(i) > arr2.get(j)) {
                sum2 += arr2.get(j++);
            } 
            else {  // When arr1[i] == arr2[j]
                // Add maximum sum of both paths till now and the common element
                result += Math.max(sum1, sum2) + arr1.get(i);
                // Reset sums
                sum1 = 0;
                sum2 = 0;
                // Move both pointers
                i++;
                j++;
            }
        }

        // If there are remaining elements in arr1
        while (i < arr1.size()) {
            sum1 += arr1.get(i++);
        }

        // If there are remaining elements in arr2
        while (j < arr2.size()) {
            sum2 += arr2.get(j++);
        }

        // Add the maximum of the remaining sums to the result
        result += Math.max(sum1, sum2);

        return result;
    }
}
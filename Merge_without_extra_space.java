class Solution {
    public static void merge(long arr1[], long arr2[], int n, int m) {
        int i = n - 1; // last element in arr1[]
        int j = 0;    // first element in arr2[]

        // Rearrange elements in arr1[] and arr2[] to merge them
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // Swap arr1[i] and arr2[j]
                long temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        // Sort arr1[] and arr2[] separately
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
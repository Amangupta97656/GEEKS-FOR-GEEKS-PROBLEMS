class Solution {
    //public int findPages(int[] arr, int k) {
        // code here
        static boolean isPossible(int[] arr, int n, int k, int mid) {
        int studentCount = 1;
        int pagesSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mid) {
                return false; 
            }

            if (pagesSum + arr[i] > mid) {
                
                studentCount++;
                pagesSum = arr[i];

                if (studentCount > k) {
                    return false;
                }
            } else {
                pagesSum += arr[i];
            }
        }
        return true;
    }

    
    static int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1; 
        int sum = 0, max = 0;
        for (int pages : arr) {
            sum += pages;
            max = Math.max(max, pages);
        }

        int low = max, high = sum, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, n, k, mid)) {
                result = mid;
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

}

 
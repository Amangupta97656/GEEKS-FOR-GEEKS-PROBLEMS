class Solution {
   public static int findClosest(int n, int k, int[] arr) {
       int s = 0, e = n - 1;
       int closestValue = arr[0];
       
       while (s <= e) {
           int mid = s + (e - s) / 2;
           if (arr[mid] == k) return arr[mid];
           
           if (Math.abs(arr[mid] - k) < Math.abs(closestValue - k) ||
               (Math.abs(arr[mid] - k) == Math.abs(closestValue - k) && arr[mid] > closestValue)) {
               closestValue = arr[mid];
           }
           
           if (arr[mid] < k) {
               s = mid + 1;
           } else {
               e = mid - 1;
           }
       }
       
       return closestValue;
   }
}


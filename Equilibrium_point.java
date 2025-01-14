class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
       int n = arr.length;
       int prev = 0;
       int sum = 0;
       
       for(int i=0; i<n; i++) {
           sum += arr[i];
       }
       
       for(int i = 0; i < n; i++) {
           sum -= arr[i];
           
           if(prev == sum) {
               return i;
           }
           prev += arr[i];
       }
       
       return -1;
    }
}
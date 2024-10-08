
class Solution {   //JAVA CODE
    public static int pairsum(int[] arr) {
        // code here
        
        int largesum = 0;
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        return arr[n - 1] + arr[n - 2];
    }
}
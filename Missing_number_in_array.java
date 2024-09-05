class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int x = Arrays.stream(arr).sum();
        
        return Math.abs((n*(n+1)/2) - x);
    }
}
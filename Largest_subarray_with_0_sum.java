class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer, Integer> prefixSum = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(sum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }
            
            if(prefixSum.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - prefixSum.get(sum));
            }
            else {
                prefixSum.put(sum, i);
            }
        }
        
        return maxLength;
    }
}
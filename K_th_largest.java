class Solution {
    public int kthLargest(int[] arr, int k) {
        int n = arr.length;
        List<Integer> finalList = new ArrayList<>();
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    finalList.add(prefix[j]);
                } else {
                    finalList.add(prefix[j] - prefix[i - 1]);
                }
            }
        }
        
        Collections.sort(finalList, Collections.reverseOrder());
        return finalList.get(k - 1);
    }
}
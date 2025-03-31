class Solution {
    public int maxPartitions(String s) {
        // code here
               int n = s.length();
        List<Integer> result = new ArrayList<>();
     
        int[] lastIndex = new int[26];
        for (int i = 0; i < n; i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < n) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']);
            if (i == end) {
                result.add(end - start + 1);
                start = end + 1;
            }
            i++;
        }
        
        return result.size();
    }
}


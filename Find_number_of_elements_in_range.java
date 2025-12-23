class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        int q = queries.length, max = 0;
        for (int[] i: queries) {
            max = Math.max(max, i[1]);
        }
        int[] prefix = new int[max + 1];
        for (int i: arr) {
            if (i <= max)
                prefix[i]++;
        }
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] += prefix[i - 1];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int[] i: queries) {
            int temp = prefix[i[1]];
            if (i[0] > 0)
                temp -= prefix[i[0] - 1];
            ans.add(temp);
        }
        return ans;
    }
}


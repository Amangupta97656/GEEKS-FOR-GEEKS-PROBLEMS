class Solution {

    private static final int MOD = 1_000_000_007;

    public int specialTriplets(int[] nums) {

        int n = nums.length;
        long result = 0L;   // use long for accumulation

        Map<Integer, Integer> rightFreq = new HashMap<>();
        for (int num : nums) {
            rightFreq.put(num, rightFreq.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> leftFreq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int mid = nums[i];

            // remove current mid from right side
            rightFreq.put(mid, rightFreq.get(mid) - 1);

            int target = mid * 2;

            int prevCount = leftFreq.getOrDefault(target, 0);
            int nextCount = rightFreq.getOrDefault(target, 0);

            // do multiplication in long and apply modulo
            long add = (long) prevCount * nextCount % MOD;
            result = (result + add) % MOD;

            // add current mid to left side
            leftFreq.put(mid, leftFreq.getOrDefault(mid, 0) + 1);
        }

        return (int) (result % MOD);
    }
}
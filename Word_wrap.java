class Solution
{
    public int helper(int[] nums, int k, int i, Integer[] mem) {
        if(i == nums.length)
            return -1;
        if(mem[i] != null)
            return mem[i];
        int lineLen = 0;
        int ans = Integer.MAX_VALUE;
        for(int j = i;j<nums.length;j++) {
            lineLen += nums[j];
            int totalLen = lineLen+j-i;
            if(totalLen > k)
                break;
            int remaining = k-totalLen;
            int res = helper(nums, k, j+1, mem);
            if(res == -1)
                res = -remaining*remaining;
            ans = Math.min(ans, remaining*remaining+res);
        }
        return mem[i] = ans;
    }
    public int solveWordWrap (int[] nums, int k)
    {
        // Code here 
        return helper(nums, k, 0, new Integer[nums.length]);
    }
}
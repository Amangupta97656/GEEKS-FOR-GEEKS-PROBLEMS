class Solution {
    static int longestSubarray(int[] arr, int k) {
        // Code Here
        Map<Integer,Integer> PrefixMap = new HashMap<>();
        PrefixMap.put(0,-1);
        int prefixSum =0,maxLen=0;
        for(int i=0;i<arr.length;i++)
        {
            prefixSum +=(arr[i]>k)?1:-1;
            if(prefixSum >0)
            {
                maxLen = i+1;
            }else
            {
                if(PrefixMap.containsKey(prefixSum -1))
                {
                    maxLen = Math.max(maxLen,i-PrefixMap.get(prefixSum -1));
                }
            }
            PrefixMap.putIfAbsent(prefixSum,i);
        }
        return maxLen;
    }
}
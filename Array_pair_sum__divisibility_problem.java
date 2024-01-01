class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n = nums.length;
        if(n%2!=0)
        return false;
        
        int zeroRem = 0;
        Map<Integer, Integer> mp = new HashMap();
        for(int i : nums){
            if(i%k == 0){
                zeroRem++;
                continue;
            }
            int target = k - (i%k);
            if(mp.containsKey(target)){
                int freq = mp.get(target);
                if(freq == 1)
                mp.remove(target);
                else
                mp.put(target, freq-1);
            }
            else
                mp.put(i%k, mp.getOrDefault(i%k, 0) + 1);
        }
        return mp.size()==0 && zeroRem%2==0;
    }
}
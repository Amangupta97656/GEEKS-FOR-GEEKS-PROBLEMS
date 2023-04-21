class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(k-num)){
                pairs += map.get(k-num);
            }
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return pairs;
    }
}
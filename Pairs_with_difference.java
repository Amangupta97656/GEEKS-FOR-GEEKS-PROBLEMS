class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr)map.put(i,map.getOrDefault(i,0)+1);
        for(int i:arr){
            if(map.containsKey(i-k)){
                count+=map.get(i-k);
            }
        }
        return count;
    }
}


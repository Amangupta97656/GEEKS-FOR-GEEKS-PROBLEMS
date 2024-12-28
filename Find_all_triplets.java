class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map.putIfAbsent(arr[i], new ArrayList<Integer>());
             
            map.get(arr[i]).add(i);
            
        }
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                int target = - arr[i] - arr[j];
                
                if(map.containsKey(target)){
                    for(int num : map.get(target)){
                        if(num > j){
                            List<Integer> triplets = Arrays.asList(i, j, num);
                            res.add(triplets);
                        }
                    }
                }
            }
        }
        
        return res;
    }
}
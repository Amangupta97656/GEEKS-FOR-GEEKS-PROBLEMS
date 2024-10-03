class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.size(); i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) > nums.size()/3){
                list.add(key);
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        
        return list;
    }
}


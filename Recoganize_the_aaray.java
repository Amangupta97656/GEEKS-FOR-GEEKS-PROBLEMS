class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        ArrayList<Integer> brr = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            brr.add(-1); 
        }
        
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= 0 && arr.get(i) < arr.size()) { 
                brr.set(arr.get(i), arr.get(i)); 
            }
        }
        
        return brr;
    }
}


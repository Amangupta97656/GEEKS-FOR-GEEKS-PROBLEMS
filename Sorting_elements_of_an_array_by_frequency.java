class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(a)==map.get(b)){
                return a-b;
            }
            else{
                return map.get(b)-map.get(a);
            }
        });
        ArrayList<Integer>result=new ArrayList<>();
        for(int key:list){
            for(int i=0;i<map.get(key);i++){
                result.add(key);
            }
        }
        return result;
    }
}
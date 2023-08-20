
class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        Map<Integer,Integer> hashmap=new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(hashmap.containsKey(arr[i])){
                int val=hashmap.get(arr[i]);
                hashmap.put(arr[i],val+1);
            }else{
                hashmap.put(arr[i],1);
            }
        }
        int count=0;
        if(hashmap.containsKey(x)){
            count=hashmap.get(x);
        }
        
        return count;
    }
}
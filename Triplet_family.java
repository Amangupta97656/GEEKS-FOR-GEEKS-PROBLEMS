class Solution {
    public boolean findTriplet(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for (int v : arr) {
        set.add(v);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(set.contains(arr[i]+arr[j]))
            return true;
        }
    }
        
        return false;
    }
}
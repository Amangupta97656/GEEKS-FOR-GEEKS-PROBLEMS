class Solution {
    boolean twoSum(int arr[], int x) {
        HashSet<Integer> s=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            int temp=x-arr[i];
            if(s.contains(temp)) return true;
            s.add(arr[i]);
        }
        return false;
    }
}
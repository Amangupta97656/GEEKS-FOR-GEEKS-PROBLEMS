class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n = arr.size();
        for(int i =1;i<=n/2;i++){
            int last = arr.remove(arr.size()-1);
            arr.add(0,last);
            int k = arr.size();
            int idx = k -i;
            arr.remove(idx);
        }
        return arr.get(0);
    }}  
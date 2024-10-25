class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = n-1; i>= n/2; i--){
            if(i != (n-i-1)){
                result.add(arr[i]);
                result.add(arr[n-i-1]);
            }
            else{
                result.add(arr[i]);
            }
        }
        return result;
    }
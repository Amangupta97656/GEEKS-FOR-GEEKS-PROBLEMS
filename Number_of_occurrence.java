class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        for(int i : arr){
            if(i == target){
                count++;
            }
        }
        return count;
    }
}


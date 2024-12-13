class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        
        int mini = arr[0];
        
        for(int i=1;i<arr.length;i++){
            mini = Math.min(arr[i],mini); 
        }
        return mini;
    }
}


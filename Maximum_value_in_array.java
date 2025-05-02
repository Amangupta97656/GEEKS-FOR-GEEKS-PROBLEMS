class Solution {
    public int findMaximum(int[] arr) {
        // code herei
    
        for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[i+1]){
        return arr[i];
        }
     }
        return arr[0];
    }
}
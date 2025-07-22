class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n =1;
        Arrays.sort(arr);
        for(int num :arr){
            if(num==n){
                n++;
            }
        }
        return n;
    }
}
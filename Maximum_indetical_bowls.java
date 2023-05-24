
class Solution {
    public static int getMaximum(int N, int[] arr) {
        long sum = 0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        while(1>0){
            if(sum % N == 0){
                return N;
            }
            N--;
        }
    }
}
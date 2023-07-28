class Solution{
     static boolean isPossible(int[] arr,long mid ,int k){
         int painter = 1;
         int time = 0;
         for(int i=0; i<arr.length; i++){
             if(arr[i] > mid) return false;
             if(time + arr[i] <= mid){
                 time += arr[i];
             }
             else{
                 painter ++;
                 time = arr[i];
             }
         }
         if(painter > k){
             return false;
         }
         return true;
     }
    static long minTime(int[] arr,int n,int k){
        //code here
       long ans = 0;
       long start = 1L;
       long end = (long)10e10;
       while(start<=end){
           long mid = start + (end-start)/2;
           if(isPossible(arr,mid,k)){
               ans = mid;
               end = mid -1;
           }
           else{
            start = mid +1;   
           }
       }
       return ans;
    }
}
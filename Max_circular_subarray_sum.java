class Solution{
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        int sum = 0;
        for(int i= 0; i< n; i++){
            sum += a[i];
        }
        int maximumsum = kadane(a , n);
        int minimumsum = sum-mini(a , n) ;
        
        if(minimumsum == 0){
            return maximumsum;
        }
        return Math.max(maximumsum, minimumsum);
    }
    static int mini(int a[] , int n){
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for(int i= 0; i< n; i++){
            sum += a[i];
            res = Math.min(sum , res);
            sum = Math.min(sum , 0);
        }
        return res;
    }
    static int kadane(int a[] , int n){
        int sum = 0;
        int res = Integer.MIN_VALUE;
        for(int i= 0; i< n; i++){
            sum += a[i];
            res = Math.max(res , sum);
            sum = Math.max(sum ,0);
        }
        return res;
    }
}
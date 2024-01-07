class Solution {
    static int bs(int arr[],int divSum){
        int ndiv=1,cs=0;
        for(int i:arr){
            if(cs+i<=divSum) cs+=i;
            else{
                ndiv++;
                cs=i;
            }
        }
        return ndiv;
    }
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int l=Integer.MIN_VALUE,r=0;
        for(int i:arr){
            l=Math.max(l,i);
            r+=i;
        }
        while(l<=r){
            int mid=(l+r)/2;
            int curr=bs(arr,mid);
            if(curr>K) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
};
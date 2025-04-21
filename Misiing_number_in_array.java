class Solution {
    int missingNum(int arr[]) {
        // code here
       long sum=0,max=0;
       for(long i : arr){
           if(i>max) max=i;
           sum+=i;
       }
       if(sum==max*(max+1)/2) return (int)max+1;
       return (int)(max*(max+1)/2 - sum);
    }
}
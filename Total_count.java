class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int l=arr.length;
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=arr[i]/k;
            if(arr[i]%k!=0){sum++;
            }
            // System.out.print(arr[i]/k+" ");
        }
        return sum;
    }
}
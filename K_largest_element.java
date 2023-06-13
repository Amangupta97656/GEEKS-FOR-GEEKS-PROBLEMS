class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        Arrays.sort(arr);//1 5 12 23 787
        int ans[]=new int[k];
        int a=0;
        while(a<k){
            ans[a]=arr[n-a-1];
            a++;
        }
        return ans;
    }
}
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here.
         int n=start.length;
       int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = finish[i];
            arr[i][1] = start[i];
        }
         Arrays.sort(arr,(a, b) -> Integer.compare(a[0], b[0]));
         int fin=-1;
         int ans=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i][1]>fin){
                 ans++;
                 fin=arr[i][0];
             }
         }
         return ans;
    }
} 
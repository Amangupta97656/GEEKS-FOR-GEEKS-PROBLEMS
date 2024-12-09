class Solution{
static ArrayList<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < n){
            int end = arr[i][1];
            j = i+1;
            while(j < n && arr[j][0] <= end){
                end = Math.max(end, arr[j][1]);
                j++;
            }
            ans.add(new int[]{arr[i][0], end});
            i = j;
        }
        return ans;
    }
  static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
         int n = intervals.length;
         int[][] arr = new int[n+1][2];
         int j = 0;
         for(int i = 0; i < n; i++,j++){
             if((i == j) && intervals[i][0] >= newInterval[0]){
                 arr[j] = newInterval;
                 j++;
                 arr[j] = intervals[i];
             }
             else {
                 arr[j] = intervals[i];
             }
         }
         
         if(j < n+1){
             arr[j] = newInterval;
             j++;
         }
         
         return mergeOverlap(arr);
    }
}
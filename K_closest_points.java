class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int res[][] = new int[k][2];
        Arrays.sort(points, (a, b) -> {
           return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]); 
        });
        
        int idx=0;
        while(idx < k) {
            res[idx] = points[idx];
            idx++;
        }
        
        return res;
    }
}
class Solution {
    public static int minimumInteger(int N, int[] A) {
       double sum = 0;
        for(int i : A) sum+= i;
        
        double temp = sum / N;
        
        int ans = Integer.MAX_VALUE;
        for(int x : A) if(x>=temp && x< ans ) ans = x;
        
        return ans;
    }
}
 
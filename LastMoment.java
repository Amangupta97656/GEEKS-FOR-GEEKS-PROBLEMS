class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        int mt = 0;
        for (int i = 0; i < left.length; i++) {
            int time = left[i];
            if (time > mt) {
                mt = time;
            }
        }
        for (int i = 0; i < right.length; i++) {
            int time = n - right[i]; 
            if (time > mt) {
                mt = time;
            }
        }
        return mt;
    }
}
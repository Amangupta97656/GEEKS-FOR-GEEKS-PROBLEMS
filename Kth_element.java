class Solution {
    public int kthElement(int a[], int b[], int k) {
        int ai = 0;
        int bi = 0; 
        int value = -1;
        for (int i = 0; i < k; i++) {
            if (ai < a.length && (bi >= b.length || a[ai] <= b[bi])) {
                value = a[ai];
                ai++;
            } else {
                value = b[bi];
                bi++;
            }
        }
        return value;
    }
}
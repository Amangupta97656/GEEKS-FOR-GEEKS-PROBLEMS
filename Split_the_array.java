
class Solution {
    static final int MOD = 1000000007;

    public static int countgroup(int arr[]) {
        int n = arr.length;
        int xorAll = 0;
        for (int num : arr) {
            xorAll ^= num;
        }
        if (xorAll != 0) {
            return 0;
        }
        long result = 1;
        for (int i = 0; i < n -1; i++) {
            result = (result * 2) % MOD;
        }
 result = (result - 1 + MOD) % MOD;
        return (int) result;
    }
}

class Solution{
	long maximizeMinHeight(int n, int k, int w,int [] a)
    {
         long left = Arrays.stream(a).min().getAsInt();

        long right = left + k + 1;

        while (left < right) {

            long mid = (left + right + 1) / 2;

            if (canAchieveMinHeight(mid, a, k, w)) {

                left = mid;

            } else {

                right = mid - 1;

            }

        }

        return left;

    }

 

    boolean canAchieveMinHeight(long minHeight, int[] a, int k, int w) {

        long[] mods = new long[a.length];

        long add = 0;

        for (int i = 0; i < a.length; i++) {

            add += mods[i];

            long v = a[i] + add;

            if (v < minHeight) {

                long delta = minHeight - v;

                if (delta > k) {

                    return false;

                }

                if (i + w < a.length) {

                    mods[i + w] -= delta;

                }

                add += delta;

                k -= delta;

            }

        }

        return true;

    }

}
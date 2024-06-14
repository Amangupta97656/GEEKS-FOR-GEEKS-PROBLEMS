class Solution {
    static String armstrongNumber(int n) {
        // NavaChaitanya30
        int t=n;
        int d1=t%10;t/=10;
        int d2=t%10;t/=10;
        int d3=(d1*d1*d1)+(d2*d2*d2)+(t*t*t);
        return d3==n?"true":"false";
    }
}


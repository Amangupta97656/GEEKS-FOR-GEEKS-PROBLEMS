class Solution {
     long findNth(long n) {
        // code here
        long res=0;
        int p=1;
        while(n>0){
           
            res+=((int)n%9)*p;
            n/=9;
            p*=10;
        }
        return res;
    }
}
class Solution {
    long findNth(long N)
    {
       long count=0;
    long P = 1;
    while(N>0){
        count+=(P*(N%9));
        N=N/9;
        P=P*10;
    }
    return count;
    }
}
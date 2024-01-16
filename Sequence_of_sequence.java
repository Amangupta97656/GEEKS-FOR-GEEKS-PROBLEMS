class Solution{
    static int numberSequence(int m, int n)
    {
        // code here
        if(n==0){return 1;
        }
        if(n > m)return 0;
       return numberSequence(m/2,n-1)+ numberSequence(m-1,n);
    }
}
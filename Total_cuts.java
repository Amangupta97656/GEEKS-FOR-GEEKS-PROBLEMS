class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int imax= A[0];
        int jmin= A[N-1];
        int count=0;
        
        int[] maxArr = new int[N];
        maxArr[0]=A[0];
        int[] minArr = new int[N];
        minArr[N-1]= A[N-1];
        
        for(int i=1;i<N;i++){
            if(A[i]>imax) imax= A[i];
            if(A[N-1-i]< jmin) jmin=A[N-1-i];
            
            maxArr[i]=imax;
            minArr[N-1-i] =jmin;
        }
        
        for(int i=0;i<N-1;i++){
            if(maxArr[i]+minArr[i+1]>=K) count++;
        }
        
        return count;
    }
}
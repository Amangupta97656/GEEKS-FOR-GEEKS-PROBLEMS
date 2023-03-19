class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        ArrayList<Integer> B=new ArrayList<>();
        int[] c=new int[N];
        int k=1;
        c[0]=0;
        int[] d=new int[N];
        d[N-1]=0;
        for(int i=0;i<N;i++)
        {
           set1.add(A[i]);
           set2.add(A[(N-1)-i]);
           if(k<N)
           {
            c[k]=set1.size();
            d[(N-1)-k]=set2.size();
           }
           k++;
        }
        for(int i=0;i<N;i++)
        B.add(c[i]-d[i]);
        
        
        return B;
    }
}
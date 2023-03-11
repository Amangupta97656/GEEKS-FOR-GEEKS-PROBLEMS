class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
      for(int i=0;i<N-1;i++)

        {

            int count=1;

            for(int j=i+1;j<N;j++)

            {

                if(A[j]==A[i])count++;

            }

            A[i]=count;

        }

           A[N-1]=1;

ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<Q.length;i++)

        {

            int count=0;

            for(int j=Q[i][0];j<=Q[i][1];j++)

            {

                if(A[j]==Q[i][2])count++;

            }

            list.add(count);

        }

        return list;

        

    }
}
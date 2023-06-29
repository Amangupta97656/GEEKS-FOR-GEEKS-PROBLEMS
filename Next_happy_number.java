class Solution{

    private boolean fun(int m){

        ArrayList<Integer> arr=new ArrayList<>();

        while(m!=1 && !arr.contains(m)){

            arr.add(m);

            m=rem(m);

        }

        return m==1;

    }

    int nextHappy(int N){

        // codNe here

        N++;

        while(!fun(N)){

            N++;

        }

        return N;

    }

   private int rem(int m){

       int sum=0;

       while(m!=0){

           int rem=m%10;

           sum+=rem*rem;

           m/=10;

       }

       return sum;

   }
}
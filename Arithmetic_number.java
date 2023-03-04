class Solution{
    static int inSequence(int A, int B, int C){
         int d=A+C;

        int e=B-d;

        if(d==B) return 1;

         

         if((C>=0 && B>=A) || (C<0 && B<=A))

         {

            if(C!=0 && e%C== 0) return 1;

         }

        return 0;

    }
}
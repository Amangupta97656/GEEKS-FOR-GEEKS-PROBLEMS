class Solution{
    static List<Long> minimumSquares(long L, long B){
        long min=Math.min(L,B);

        long max=Math.max(L,B);

        long k=gcd(max,min);

        

          List<Long> ans=new ArrayList<>();

          

        long n=(L*B)/(k*k);

        ans.add(n);

        ans.add(k);

        return ans;

    }

    public static long gcd(long a ,long b){

        

        if(b==0)return a;

        

        

        return gcd(b,a%b);

    }

}
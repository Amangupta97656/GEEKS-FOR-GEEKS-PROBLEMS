class Solution {
    public long[] optimalArray(int n,int a[])
    {
         long ans[]=new long[n];

        ans[0]=0;

        long prem=a[0];

        long newmed=0;

        for(int i=1;i<n;i++){

            if(i%2==0){

                newmed=a[i/2];

                ans[i]=ans[i-1]+a[i]-newmed;

            }

            else{

                newmed=(a[i/2]+a[i/2+1])/2;

                ans[i]=ans[i-1]+(newmed-prem)+(a[i]-newmed);

            }

            prem=newmed;

        }

        return ans;

    }

}
   
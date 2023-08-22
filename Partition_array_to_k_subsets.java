class Solution

{

    public int partition(int n,int a[],int i,int mask,int tar,int target,int dp[][][])

    {

        if(tar<0)

        return 0;

        if(i==n)

        {

            if(tar>0)

            return 0;

            if(tar==0)

            {

                if(mask==((1<<n)-1))

                return 1;

                return partition(n,a,0,mask,target,target,dp);

            }

        }

        if(dp[i][mask][tar]!=-1)

        return dp[i][mask][tar];

        int x=0,y=0;

        if(!(((1<<i) & mask)>0))

            x=partition(n,a,i+1,(1<<i) ^ mask,tar-a[i],target,dp);

        y=partition(n,a,i+1,mask,tar,target,dp);

        return dp[i][mask][tar]=(x | y);

    }

    public boolean isKPartitionPossible(int a[], int n, int k)

    {

        int sum=0;

        for(int i=0;i<n;i++)

        sum+=a[i];

        if(sum%k!=0)

        return false;

        int dp[][][]=new int[n][1<<n][(sum/k)+1];

        for(int i=0;i<n;i++)

        {

            for(int j=0;j<(1<<n);j++)

            Arrays.fill(dp[i][j],-1);

        }

        int z=partition(n,a,0,0,sum/k,sum/k,dp);

        if(z==1)

        return true;

        return false;

 // Your code here 

    }

}

 
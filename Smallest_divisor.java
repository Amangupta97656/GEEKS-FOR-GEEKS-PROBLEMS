class Solution {
    int smallestDivisor(int[] arr, int k) 
    {
        int low=1,high=Arrays.stream(arr).max().getAsInt();
        int ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isValid(mid,arr,k))
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
   static boolean isValid(int a,int []arr,int k)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=(int) Math.ceil((double) arr[i] / a);
        }
        return sum<=k;
    }
}
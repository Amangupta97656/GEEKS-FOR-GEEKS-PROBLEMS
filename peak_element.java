class Solution
{
	public int peakElement(int[] arr,int n)
    {
         int maxi=0;
          int j=0;
            for(int i =0;i<n;i++){
                if(arr[i]>maxi){
                    maxi = arr[i];
                    j=i;
                }
            }
   return j;
        }
};
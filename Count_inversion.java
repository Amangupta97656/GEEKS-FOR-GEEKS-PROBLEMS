class Solution
{
      static long inversionCount(long arr[], long N)
    {
    return divide(arr, 0, N-1);
    }

    public static long divide(long arr[], long si, long ei) {
        if (si >= ei) {
            return 0;
        }
        long mid = si + (ei - si) / 2;
        long inv = divide(arr, si, mid);
        inv += divide(arr, mid + 1, ei);
        inv += conquer(arr, si, mid, ei);
        return inv;
    }
    public static long conquer(long arr[], long si, long mid, long ei) {
        long inv_count=0;
        mid=(si+ei)/2;
        long len1=mid-si+1;
        long len2=ei-mid;
        long arr1[] = new long[(int)len1];
        long arr2[] = new long[(int)len2];
        long originalIndex=si;
        for(int i=0; i<len1; i++)
        {
            arr1[i]=arr[(int)originalIndex++];
        }
        for(int i=0; i<len2; i++)
        {
            arr2[i]=arr[(int)originalIndex++];
        }
        originalIndex=si;
        long idx1=0;
        long idx2=0;
        while(idx1<len1 && idx2<len2)
        {
            if(arr1[(int)idx1]>arr2[(int)idx2])
            {
                 inv_count=inv_count+(len1-idx1);
                arr[(int)originalIndex++]=arr2[(int)idx2++];
            }
            else{
                arr[(int)originalIndex++]=arr1[(int)idx1++];
            }
        }

        while(idx1<len1)
        {
            arr[(int)originalIndex++]=arr1[(int)idx1++];
        }
        while(idx2<len2)
        {
            arr[(int)originalIndex++]=arr2[(int)idx2++];
        }
        return inv_count;
    }
}
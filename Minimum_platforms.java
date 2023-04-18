class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
         Arrays.sort(arr);
        Arrays.sort(dep);
        int count=0;
        int maxCount = 0;
        int j=0;
        int i=0;
        while(i<n){
            if(arr[i]<=dep[j]){
                count++;
                maxCount = Math.max(count,maxCount);
                i++;
            }else if(arr[i]>dep[j]){
                count--;
                j++;
            }
        }
        return maxCount;
    }
}
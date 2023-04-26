class Solution {
    int print2largest(int arr[], int n) {
         int max=0;
        int secMax=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secMax && arr[i]!=max)
            secMax=arr[i];
        }
        return secMax;
    }
}
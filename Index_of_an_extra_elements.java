class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        int i=0;
        while(i<n-1)
        {
            if(arr1[i]!=arr2[i])
            return i;
            i++;
        }
        return n-1;
    }
}
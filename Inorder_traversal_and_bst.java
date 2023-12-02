class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) arr1[i] = arr[i];
        Arrays.sort(arr1);
        for(int i = 0; i < N; i++) if(arr[i] != arr1[i]) return 0;
        return 1;
    }
}
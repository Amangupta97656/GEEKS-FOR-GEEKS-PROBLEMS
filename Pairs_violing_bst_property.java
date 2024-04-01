class Solution {
    int i = 0, count = 0;
    public int pairsViolatingBST(int n, Node root) {
        i = 0; count = 0;
        int[] arr = new int[n];
        inOrder(root, arr);
        mergeSort(arr, 0, n-1);
        return count;
    }
    public void inOrder(Node root, int[] arr)
    {
        if(root == null)
        return;
        
        inOrder(root.left, arr);
        arr[i++] = root.data;
        inOrder(root.right, arr);
    }
    public void mergeSort(int[] arr, int low, int high)
    {
        if(low >= high)
        return;
        
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public void merge(int[] arr, int low, int mid, int high)
    {
        int[] temp = new int[high-low+1];
        i = low;
        int j = mid+1, k = 0;
        
        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            temp[k++] = arr[i++];
            else
            {
                count+=(mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        
        while(i <= mid)
        temp[k++] = arr[i++];
        
        while(j <= high)
        temp[k++] = arr[j++];
        
        k = 0;
        for(i=low; i<=high; i++, k++)
        arr[i] = temp[k];
    }
}
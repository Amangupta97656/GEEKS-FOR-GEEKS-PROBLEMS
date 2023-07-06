class Solution
{
    static void swap(int arr[], int i, int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low <high){
            int pi= partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
       int  pivot= arr[high];
     int count=low-1;
        for(int i=low; i<high;i++){
            if(arr[i]<pivot){
                count++;
                swap(arr, count, i);
              
            }
        }
          swap(arr, count+1, high);
          return count+1;
        }
    
}
class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
     int arr[] = new int[m+n];
        int i =0, j =0;
        while (i<n){
            arr[i] = a[i];
            i++;
        }
        while (j<m){
            arr[i] = b[j];
            i++;
            j++;
        }
        Arrays.sort(arr);
        double res = 0;
        if ((m+n)%2!=0){
            res  = arr[(m+n)/2];
        }
        else {
            res  = (arr[(m+n)/2]+ arr[(m+n)/2-1])/2.0;
        }
        
        return res;
    }
}
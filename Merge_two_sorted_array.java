class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int m =a.length;
        int n =b.length;
        for(int i=0;i<m;i++){
            if(a[i]>b[0]){
                int temp =a[i];
                a[i]=b[0];
                b[0]=temp;
                int first = b[0];
                int k;
                for(k=1;k<n&&b[k]<first;k++){
                    b[k-1]=b[k];
                }
                b[k-1]=first;
            }
        }
    }
}


class Solution {
   int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int row = -1;
        int maxCount = 0;
        for(int r=0; r<n; r++){
            int oneCount = 0;
            if(arr[r][0] == 1) return r;
            for(int j=m-1; j>=0; j--){
                if(arr[r][j] == 1) oneCount++;
                else break;
            }
            if(oneCount > maxCount){
                maxCount = oneCount;
                row = r;
            }
        }
        return row;
    }
}
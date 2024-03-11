class Solution {
    boolean bs(int arr[][],int val,int n){
        int l=0;
        int h=n*n-1;
        
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid/n][mid%n]==val) return true;
            else if(arr[mid/n][mid%n]<val) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int res=x-mat1[i][j];
                if(bs(mat2,res,n)==true){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
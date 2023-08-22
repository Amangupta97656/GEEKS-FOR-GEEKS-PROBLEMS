

class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int arr[]=new int[N];
        int max=Integer.MIN_VALUE;
        int rowSumMax=Integer.MIN_VALUE;
        int colSumMax=Integer.MIN_VALUE;
        
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=0;j<N;j++){
                sum+=matrix[i][j];
            }
            arr[i]=sum;
            rowSumMax=Math.max(rowSumMax,sum);
        }
          for(int i=0;i<N;i++){
            int sum=0;
            for(int j=0;j<N;j++){
                sum+=matrix[j][i];
            }
            colSumMax=Math.max(colSumMax,sum);
        }
        
        int ans=0;
        max=Math.max(rowSumMax,colSumMax);
        for(int i=0;i<N;i++){
            ans+=(max-arr[i]);
        }
        
        
        return ans;
    }
}
class Solution
{
    public void transpose(int n,int a[][])
    {
        
       
        //ith index starts from 0
        for(int i=0; i<=n-2; i++){
            for(int j=i+1; j<n; j++ ){
              int temp = 0;
              temp = a[i][j];
              a[i][j] = a[j][i];
              a[j][i] = temp;
            }
        }
    }
}
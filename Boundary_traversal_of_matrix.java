class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here by   ayush chaubey
        //n = row of matrix
        // m = column of matrix
        
        ArrayList<Integer> ayu= new ArrayList<Integer>();
        
        int a=0;//for row
        int b=0;//for column'
        
        
        
        
        //if matrix has only one row
        if(n==1)
        {
             for(int j=0;j<m;j++)
        {
            ayu.add(matrix[0][j]);
        }
        return ayu;
        }
        
        
        // if matrix have only obe column
        if(m==1)
        {
             for(int j=0;j<n;j++)
        {
            ayu.add(matrix[j][0]);
        }
        return ayu;
        }
        
        //pahla row print ho gaya
        for(int j=0;j<m;j++)
        {
            ayu.add(matrix[a][j]);
        }
        
        //last column k liye
        b=m-1;
        
        for(int i=1;i<n;i++)
        {
            ayu.add(matrix[i][b]);
        }
        
        // last row k liye
        a=n-1;
        
        for(int j=b-1;j>=0;j--)
        {
             ayu.add(matrix[a][j]); 
        }

        
        // for 1st col
       
          for(int i=a-1;i>0;i--)
        {
             ayu.add(matrix[i][0]); 
        }

return ayu;
        
        
        
        
    }
}
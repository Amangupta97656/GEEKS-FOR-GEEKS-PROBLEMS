class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        int upperTriangleSum = 0;
        int lowerTriangleSum = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                upperTriangleSum += matrix[i][j];
                lowerTriangleSum += matrix[j][i];
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(upperTriangleSum);
        res.add(lowerTriangleSum);
        return res;
    }
}
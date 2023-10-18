
class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer>li=new ArrayList<Integer>();
        int top=0,left=0,right=c-1,bottom=r-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
            li.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            li.add(matrix[i][right]);
        }
        right--;
        if(!(top<=bottom && left<=right)){
            break;
        }
        for(int i=right;i>=left;i--){
            li.add(matrix[bottom][i]);
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            li.add(matrix[i][left]);
        }
        left++;
        }
        return li;
    }
}

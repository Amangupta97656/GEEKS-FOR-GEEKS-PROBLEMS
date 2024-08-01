class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
         ArrayList<Integer>list=new ArrayList<>();
        int r=matrix.length;//rows
        int c=matrix[0].length;//column
        
        
        //create boundaries 
        int sr=0;
        int er=r-1;
        int sc=0;
        int ec=c-1;
        
       while(sr<=er && sc<=ec){
           
          //move right
         for(int j=sc;j<=ec;j++){
             list.add(matrix[sr][j]);
         }
         //row update
         sr++;
         
         //move down 
         for(int i=sr;i<=er;i++){
             list.add(matrix[i][ec]);
         }
         //column update
        ec--;
         
         //move left
       if(sr<=er){
             for(int j=ec;j>=sc;j--){
             list.add(matrix[er][j]);
         }
           er--;
      
       }
     
         
         //move up
        if(sc<=ec){
             for(int i=er;i>=sr;i--){
             list.add(matrix[i][sc]);
         }
       }
               sc++;
        }

       
       return list;
     
    }
}
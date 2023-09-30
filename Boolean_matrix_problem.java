class Solution{
    void booleanMatrix(int matrix[][]){
        
        int row = matrix.length;
        int column = matrix[0].length;
        HashMap<Integer,Integer> r = new HashMap<>(); // checking which row needs to be fully 1;
        HashMap<Integer,Integer> c = new HashMap<>();// checking which column needs to be fully 1
        
        
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                if(matrix[i][j]==1){  // checking the row and column if we get 1 we put i and  j to our map
                if(!r.containsKey(i)){
                    r.put(i,0);
                }
                if(!c.containsKey(j)){
                    c.put(j,0);
                }
                    
                }
            }
        }
        
        
        for(int i = 0;i<row;i++){    
            if(r.containsKey(i)){      // if i is in our map we change that whole row to 1;
                for(int j =0;j<column;j++){
                    matrix[i][j]=1;
                }
            }
        }
         for(int i = 0;i<column;i++){
            if(c.containsKey(i)){
                for(int j =0;j<row;j++){
                    matrix[j][i]=1;
                }
            }
        }
        
        
        
    }
}
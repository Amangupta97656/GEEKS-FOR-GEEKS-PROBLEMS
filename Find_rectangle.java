class Solution {
    public boolean ValidCorner(int mat[][]) {
        // Code here
        
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    list.add(j);
                }
            }
            
            for(int k=i+1;k<n;k++){
                int count=0;
                for(int l:list){
                    if(mat[k][l]==1){
                        count++;
                    }
                }
                if(count>1){
                    return true;
                }
            }
        }
        return false;
    }
}
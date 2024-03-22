class Tree {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        ArrayDeque<Node> q= new ArrayDeque<>();
        ArrayList<Integer> ans= new ArrayList<>();
        
        q.add(root);
        
        while(q.size()>0){
            int size= q.size();
            int sum=0;
            
             while(size-->0){
                 Node remove= q.remove();
                 while(remove!=null){
                     sum+= remove.data;
                    if(remove.left!=null) q.add(remove.left);
                    
                    remove= remove.right;
                 }
                
             }
              ans.add(sum);
        }
        return ans;
    }
}
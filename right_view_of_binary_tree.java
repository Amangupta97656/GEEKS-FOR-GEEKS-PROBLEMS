class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        //add code here.
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
            
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0; i<levelSize; i++){
                Node node=queue.poll();
                
                if(i==levelSize-1)
                    result.add(node.data);
                    
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
        }
        return result;
    }
}
class Tree
{
    ArrayList<Integer> al=new ArrayList<>();
    Queue<Node> q=new LinkedList<Node>();
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        al.clear();
        q.clear();
        levelOrder(node);
        Collections.reverse(al);
        return al;
    }
    void levelOrder(Node root){
        if(root==null){
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            al.add(curr.data);
            if(curr.right!=null){
                q.add(curr.right);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
        }
    }
}
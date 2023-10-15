class GfG
{
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        if(root==null) return null;
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
        return constructTree(list,0,list.size()-1);
    }
    public void inorder(Node root,ArrayList<Integer>list){
        if(root==null) return ;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public Node constructTree(ArrayList<Integer>list,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        Node curr = new Node(list.get(mid));
        curr.left=constructTree(list,low,mid-1);
        curr.right=constructTree(list,mid+1,high);
        return curr;
    }
}


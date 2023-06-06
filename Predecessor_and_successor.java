static ArrayList<Node> list;
    public static void inorderTraversal(Node root)
    {
        if(root==null)
            return;
        list.add(root);
        inorderTraversal(root.left);
        inorderTraversal(root.right);
    }
    public static void findPreSuc(Node root, int key)
    {
        list=new ArrayList<Node>();
        inorderTraversal(root);
        int preTemp = Integer.MAX_VALUE,sucTemp=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            Node tempNode = list.get(i);
            int calc=Math.abs(key-tempNode.data);
            if(key>tempNode.data && calc<preTemp)
            {
                preTemp=calc;
                pre=tempNode;
            }
            else if(key<tempNode.data && calc<sucTemp)
            {
                sucTemp=calc;
                suc=tempNode;
            }
        }
    }
}

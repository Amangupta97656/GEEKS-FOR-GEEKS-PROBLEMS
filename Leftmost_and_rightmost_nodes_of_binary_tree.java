class Tree
{
    public static void printCorner(Node node)
    {
        if(node == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int cnt = q.size();
            for(int i=0; i<cnt; i++)
            {
                Node cur = q.peek();
                q.remove();
                if(i==0 || i == cnt-1)
                {
                    System.out.print(cur.data + " ");
                }
                if(cur.left != null ) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
        }
    }
    
}
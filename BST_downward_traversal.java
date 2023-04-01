class Solution
{
     Node findNode(Node root,int t){
       while(root != null){
        if(root.data == t)
        return root;
        if(root.data < t)
        root = root.right;
        else
        root = root.left;
       }
       return root;
    }
    int findSum(Node root){
        int sum = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(curr.hd == 0)
            sum += curr.n.data;
            if(curr.n.left != null){
                q.add(new Pair(curr.n.left,curr.hd-1));
            }
            if(curr.n.right != null){
                q.add(new Pair(curr.n.right,curr.hd+1));
            }
        }
        return sum-root.data;
    }
    long verticallyDownBST(Node root,int target)
    {
      Node n = findNode(root,target);
      if(n == null)
      return -1;
      
      //else
      return findSum(n);
    }
    class Pair{
        Node n;
        int hd;
        Pair(Node n,int hd){
            this.n = n;
            this.hd = hd;
        }
    }
}
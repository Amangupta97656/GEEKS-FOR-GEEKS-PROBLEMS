class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
      Queue<Node>q=new LinkedList<>();
      ArrayList<Integer>arr=new ArrayList<>();
      if(root==null){
          return arr;
      }
      arr.add(root.data);
      q.add(root);
      q.add(null);
      while(true){
          Node x=q.remove();
          if(x==null){
              if(q.isEmpty()){
                  return arr;
              }
              q.add(x);
              Node y=q.remove();
              arr.add(y.data);
             if(y.left!=null){
                 q.add(y.left);
             }
             if(y.right!=null){
                 q.add(y.right);
             }
              
          }
          else{
               if(x.left!=null){
                 q.add(x.left);
             }
             if(x.right!=null){
                 q.add(x.right);
             }
          }
          
      }
    }
}
class Solution
{
   
   static void find(Node root,int n1,int n2,String str,ArrayList<String> list){
       
       if(root==null)
           return;
       if(root.data==n1||root.data==n2){
           list.add(new String(str));
           return;
       }
       find(root.left,n1,n2,str+'0',list);
       find(root.right,n1,n2,str+'1',list);
       
        
       
   }
   
   
   static Node lca(Node root,int n1,int n2){
       
       
       if(root==null)
          return  null;
        if(root.data==n1||root.data==n2)
           return root;
       Node left = lca(root.left,n1,n2);
       Node right = lca(root.right,n1,n2);
       
       if(left!=null&&right!=null&&(left.data==n1||left.data==n2)&&(right.data==n1||right.data==n2))
           return root;
       
       if(left!=null)
           return left;

       return right;
      
   }
   
   
   static int NumberOfTurns(Node root, int first, int second)
   {
       String str = "";
       ArrayList<String> ans = new ArrayList<>();
       Node lc = lca(root,first,second);
       if(lc.data==first||lc.data==second){
           find(lc.left,first,second,str+'0',ans);
           str = "";
           find(lc.right,first,second,str+'1',ans);
       }else
           find(lc,first,second,str,ans);
           
       

       
       
       int t = 0;
       for(String s:ans){
           int n = s.length();
           for(int i=0;i<n-1;i++){
               
               if((s.charAt(i)=='0'&&s.charAt(i+1)=='1')||(s.charAt(i)=='1'&&s.charAt(i+1)=='0'))
                   t++;
           }
           
       }
       if(lc.data==first||lc.data==second)
           return t;
       return t+1;

   }
}
 
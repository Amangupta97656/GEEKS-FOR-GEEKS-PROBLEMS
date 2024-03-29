class Solution
{
    public static int countPairs(Node root1, Node root2, int x)
    {
        // Code here
         if(root1==null)return 0;
        int ans = 0;
        
        
        //preorder traversal 
        //left
        ans+=countPairs(root1.left,root2,x);
        
        //root
        if(find(root2, x-root1.data)==true)ans++;
        //right
        ans+= countPairs(root1.right, root2, x);
        return ans;
        
    }
    
    public static boolean find(Node root, int tar){
        if(root==null)return false;
        
        if(root.data>tar){
            return find(root.left, tar);
        }else if(root.data<tar){
            return find(root.right, tar);
        }else{
            return true;
        }
    }
}
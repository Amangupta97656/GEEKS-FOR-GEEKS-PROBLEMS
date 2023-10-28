class Solution
{
    boolean isSumTree(Node root)
    {
             // Your code here
             if(root == null)return true;
             if(root.left == null && root.right == null)return true;
             boolean l = isSumTree(root.left);
             boolean r = isSumTree(root.right);
             int le = 0;
             int ri = 0;
             if(root.left!= null)le = root.left.data;
             if(root.right != null)ri = root.right.data;
             boolean res = (le+ri == root.data);
             if(l && r && res){
                 root.data += le+ri;
                 return true;
             }
             else return false;
    }
}


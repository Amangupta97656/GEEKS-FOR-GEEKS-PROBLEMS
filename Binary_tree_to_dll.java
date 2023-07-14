
class Solution
{   static Node h=null;
Node prev=null;
private void inorder(Node root)
{
if(root==null)
return;
inorder(root.left);
 
if(prev!=null)
{
root.left=prev;
prev.right=root;
 
}
else
h=root;
prev=root;
inorder(root.right);
}
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
inorder(root);
return h;
 
    }
}
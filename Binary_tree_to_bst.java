
class Solution
{
  Node binaryTreeToBST(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        binaryTreeToBST(root,list);
        return root;
    }
    public void inorder( Node root, ArrayList<Integer> list ){
        if(root!=null) {
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
    public static void binaryTreeToBST( Node root, ArrayList<Integer> list ){
        if(root!=null) {
            binaryTreeToBST(root.left, list);
            root.data = list.remove(0);
            binaryTreeToBST(root.right, list);
        }
    }
}
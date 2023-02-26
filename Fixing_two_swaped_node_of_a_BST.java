class Solution {
    List<Integer>li=new ArrayList<Integer>();
    int p=0;
    public Node correctBST(Node root) {
        inorder(root);
        p=0;
        Collections.sort(li);
        fix(root);
        return root;
    }
    private void inorder(Node root){
        if(root!=null){
        inorder(root.left);
        li.add(root.data);
        inorder(root.right);
        }
    }
    private void fix(Node root){
        if(root!=null){
        fix(root.left);
        root.data=li.get(p);
        p+=1;
        fix(root.right);
        }
    }
}
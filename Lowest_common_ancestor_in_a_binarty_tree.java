class Solution{
    //Function to return the lowest common ancestor in a Binary Tree.
    boolean Path(Node root,int n,ArrayList<Node> l){
        if(root == null){
            return false;
        }
        l.add(root);
        if(root.data == n){
            return true;
        }
        boolean lPath = Path(root.left,n,l);
        boolean RPath = Path(root.right,n,l);
        if(lPath || RPath){
            return true;
        }
        l.remove(l.size()-1);
        return false;
    }
    Node lca(Node root,int n1,int n2){
        // Your code here
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        Path(root,n1,path1);
        Path(root,n2,path2);
        int i = 0;
        while((i < path1.size()) && (i < path2.size())){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
        }
        return path1.get(i-1);
    }
}
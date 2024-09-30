class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root1,list);
        inOrder(root2,list);
        Collections.sort(list);
        return list;
        
    }
    public void inOrder(Node root,List<Integer> list){
        if(root==null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.data);
        inOrder(root.right,list);
    }
}
class Solution
{
    public void leftTraverse(Node root, ArrayList<Integer> list) {
        if(root == null || (root.left == null && root.right == null) ) {
            return;
        } 
        list.add(root.data);
        if(root.left != null) {
            leftTraverse(root.left,list);
        } else {
            leftTraverse(root.right,list);
        }
    }
    public void leafTraverse(Node root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            list.add(root.data);
            return;
        }
        leafTraverse(root.left,list);
        leafTraverse(root.right,list);
    }
    public void rightTraverse(Node root, ArrayList<Integer> list) {
        if(root == null || (root.left == null && root.right == null) ) {
            return;
        }
        if(root.right != null) {
            rightTraverse(root.right,list);
        } else {
            rightTraverse(root.left,list);
        }
        list.add(root.data);
    }
	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> list = new ArrayList<>();
	    if(root == null) {
	        return list;
	    }
	    list.add(root.data);
	    leftTraverse(root.left,list);
	    leafTraverse(root.left,list);
	    leafTraverse(root.right,list);
	    rightTraverse(root.right,list);
	    return list;
	}
}
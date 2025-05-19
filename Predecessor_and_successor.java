class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> result = new ArrayList<>();
        Node predecessor = null;
        Node successor = null;
        while (root != null) {
            if (root.data == key) {
                if (root.left != null) {
                    Node temp = root.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    predecessor = temp;
                }
                if (root.right != null) {
                    Node temp = root.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    successor = temp;
                }
                break;
            } else if (root.data < key) {
                predecessor = root;
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        result.add(predecessor);
        result.add(successor);
        return result;
    
    }
}


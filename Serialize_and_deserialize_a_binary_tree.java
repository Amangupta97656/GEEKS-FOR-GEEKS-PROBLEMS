class Tree {
    private int idx = 0;

    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> rst = new ArrayList<>();
        serializeHelper(root, rst);
        return rst;
    }

    private void serializeHelper(Node root, ArrayList<Integer> rst) {
        if (root == null) {
            rst.add(-1);
            return;
        }
        rst.add(root.data);
        serializeHelper(root.left, rst);
        serializeHelper(root.right, rst);
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        idx = 0;
        return deSerializeHelper(A);
    }

    private Node deSerializeHelper(ArrayList<Integer> A) {
        if (idx == A.size() || A.get(idx) == -1) {
            idx++;
            return null;
        }
        Node root = new Node(A.get(idx++));
        root.left = deSerializeHelper(A);
        root.right = deSerializeHelper(A);
        return root;
    }
}
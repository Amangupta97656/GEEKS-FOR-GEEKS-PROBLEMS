class Solution {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Node> map = new HashMap<>();
    void correctBST(Node root) {
        // code here.
        inorder(root);
        List<Node> swappedNodes = findSwappedNodes();
        Node n1 = swappedNodes.get(0);
        Node n2 = swappedNodes.get(1);
        int temp = n1.data;
        n1.data = n2.data;
        n2.data = temp;
        return;
    }
    
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        list.add(node.data);
        map.put(node.data, node);
        inorder(node.right);
    }
    
    List<Node> findSwappedNodes() {
        int prev = list.get(0);
        int min = Integer.MAX_VALUE;
        List<Node> swappedNodes = new ArrayList<>();
        int i = 1;
        for (; i < list.size(); i++) {
            if (prev > list.get(i)) {
                swappedNodes.add(map.get(prev));
                break;
            }
            prev = list.get(i);
        }
        for (; i < list.size(); i++) {
            if (prev > list.get(i))
            min = Math.min(list.get(i), min);
        }
        swappedNodes.add(map.get(min));
        return swappedNodes;
    }
}
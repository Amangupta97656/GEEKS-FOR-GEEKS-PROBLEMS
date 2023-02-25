class Solution {
    
    Map<Integer, Node> visitedNodes = new HashMap<>();
    
    public void connect(Node root) {
        visitedNodes.clear();
        searchNode(root, 0);
    }
    
    public void searchNode(Node node, int depth) {
        if (node == null) {
            return;
        }
        
        node.nextRight = visitedNodes.containsKey(depth) ? visitedNodes.get(depth) : null;
        
        visitedNodes.put(depth, node);
        
        searchNode(node.right, depth + 1);
        searchNode(node.left, depth + 1);
    }
}
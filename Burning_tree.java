class Solution {
    static int maxTime = 0;
    public static int minTime(Node root, int target) {
        // code here
        maxTime = 0;
        burnTree(root, target);
        return maxTime;
    }
    private static int burnTree(Node node, int target){
        // Target node is not encountered
        if(node == null){
            return -1;
        }
        if(node.data == target){
            burnSubTree(node, 0);
            return 1;
        }
        
        int left = burnTree(node.left, target);
        if(left != -1){
            // If fire came from left burn right sub tree
            burnSubTree(node.right, left+1);
            maxTime = Math.max(maxTime, left);
            return left+1;
        }
        
        int right = burnTree(node.right, target);
        if(right != -1){
            // If fire came from right burn left sub tree
            burnSubTree(node.left, right+1);
            maxTime = Math.max(maxTime, right);
            return right+1;
        }
        
        return -1; // Target Node not found
    }
    private static void burnSubTree(Node node, int time){
        if(node == null){
            return;
        }
        maxTime = Math.max(maxTime, time);
        burnSubTree(node.left, time+1);
        burnSubTree(node.right, time+1);
    }
}
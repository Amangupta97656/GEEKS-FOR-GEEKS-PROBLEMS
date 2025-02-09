class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node node) {
        // your code goes here
        if(node==null)return -10000;
        int numSumLeft = count(node.left);
        int numSumRight = count(node.right);
        numSumLeft = numSumLeft<0?0:numSumLeft;
        numSumRight = numSumRight<0?0:numSumRight;
        int curr = node.data + numSumLeft + numSumRight;
        int leftnode = findMaxSum(node.left);
        int rightnode = findMaxSum(node.right);
        return Math.max(curr,Math.max(leftnode,rightnode));
    }
    
    public static int count(Node root){
        if(root==null)return -10000;
        int num = root.data;
        int left = num + count(root.left);
        int right = num + count(root.right);
        return Math.max(num,Math.max(left,right));
    }
}

class Solution {
    Node prev = null, first = null, second = null;

    // Function to fix a given BST where two nodes are swapped.
    public Node correctBST(Node root) {
        // Find the misplaced nodes by performing an inorder traversal.
        findMisplacedNodes(root);

        // Swap the values of the misplaced nodes.
        if (first != null && second != null) {
            int temp = first.data;
            first.data = second.data;
            second.data = temp;
        }

        return root;
    }

    public void findMisplacedNodes(Node root) {
        if (root == null) {
            return;
        }

        findMisplacedNodes(root.left);

        // Compare the current node with the previous node.
        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }

        prev = root;

        findMisplacedNodes(root.right);
    }
}
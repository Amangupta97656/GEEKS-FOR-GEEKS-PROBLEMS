class Solution {
    boolean findTarget(Node root, int target) {
        return hasPairWithSum(root, target, new HashSet<>());
    }

    private boolean hasPairWithSum(Node root, int target, HashSet<Integer> set) {
        if (root == null) return false;

        // Check in the left subtree
        if (hasPairWithSum(root.left, target, set)) return true;

        // Check if the complement exists
        if (set.contains(target - root.data)) return true;

        // Add the current value to the set
        set.add(root.data);

        // Check in the right subtree
        return hasPairWithSum(root.right, target, set);
    }
}

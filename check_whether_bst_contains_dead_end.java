public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
       return helper(root, 1, Integer.MAX_VALUE);
    }

    private static boolean helper(Node node, int min, int max) {
        if (node == null) {
            return false;
        }

        if (min == max) {
            return true;
        }

        boolean left = helper(node.left, min, node.data - 1);
        boolean right = helper(node.right, node.data + 1, max);

        return left || right || (node.data == min && node.data == max);
    }
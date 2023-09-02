class Solution {
    List<Integer> ans = new ArrayList<>();
    int cost = 0;

    public int getCount(Node node, int bud) {
        postorder(node, bud);
        Collections.sort(ans);
        int sum = 0;
        int i = 0;
        while (i < ans.size()) {
            sum += ans.get(i);
            if (sum > bud) {
                break;
            }
            i++;
        }
        return i;
    }

    private void postorder(Node node, int bud) {
        if (node == null) {
            return;
        }
        cost = cost + 1;
        postorder(node.left, bud);
        postorder(node.right, bud);
        if (node.left == null && node.right == null) {
            ans.add(cost);
        }
        cost = cost - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Construct your binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int bud = 5;
        int result = solution.getCount(root, bud);
        System.out.println("Result: " + result);
    }
}
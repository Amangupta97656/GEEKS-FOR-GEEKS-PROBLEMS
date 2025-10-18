class Solution {
    public int findMedian(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, ans);
        Collections.sort(ans);
        int n = ans.size();
        int idx = (n + 1) / 2;
        return ans.get(idx-1);
    }
    
    public static void helper(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        ans.add(root.data);
        helper(root.left, ans);
        helper(root.right, ans);
    
    }
}
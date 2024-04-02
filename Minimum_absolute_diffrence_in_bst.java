class Solution {
    int absolute_diff(Node root) {
        if(root == null) {
            return -1; 
        }
        int min_diff = Integer.MAX_VALUE;
        Node cur = root, pre = null;
        int temp = Integer.MIN_VALUE; // initialize temp to the smallest integer
        while(cur != null) {
            if(cur.left == null) {
                if (temp != Integer.MIN_VALUE) {
                    min_diff = Math.min(min_diff, Math.abs(cur.data - temp));
                }
                temp = cur.data; // update temp
                cur = cur.right;
            } else {
                pre = cur.left;
                while(pre.right != null && pre.right != cur) {
                    pre = pre.right;
                }
                if(pre.right == null) {
                    pre.right = cur;
                    cur = cur.left;
                } else {
                    pre.right = null; 
                    if (temp != Integer.MIN_VALUE) {
                        min_diff = Math.min(min_diff, Math.abs(cur.data - temp));
                    }
                    temp = cur.data; 
                    cur = cur.right; 
                }
            }
        }
        return min_diff;
    }
}
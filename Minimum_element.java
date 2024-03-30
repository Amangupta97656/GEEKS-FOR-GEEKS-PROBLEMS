class Solution {
    int minValue(Node root) {
       if(root.left==null) return root.data;
return minValue(root.left);
    }
}
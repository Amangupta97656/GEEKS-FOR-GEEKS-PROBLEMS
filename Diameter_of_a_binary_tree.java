class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        return findDiameter(root).diameter;
        
    }
    public Info findDiameter(Node root){
        if(root == null) return new Info(0, 0);
        Info left = findDiameter(root.left);
        Info right = findDiameter(root.right);
        Info newInfo = new Info();
        newInfo.diameter = Math.max(left.height + right.height + 1, Math.max(left.diameter, right.diameter));
        newInfo.height = Math.max(left.height, right.height) + 1;
        return newInfo;
        
    }
}
class Info{
    int diameter;
    int height;
    
    Info(){}

    Info(int diameter, int height){
        this.diameter = diameter;
        this.height = height;
    }
}
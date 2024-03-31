class Solution {
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        int max =-1;
       while(root != null)
       {if(root.key == n)
             return root.key;
             else if(root.key < n)
             {
                 max = Math.max(max,root.key);
                 root = root.right;
             }
             else
             {
                 root = root.left;
             }
       }
           return max;
          
    }}
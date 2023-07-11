class Solution

{

    int max[]=new int[1];

    int maxPathSum(Node root)

    { 

        // code here 

        max[0]=Integer.MIN_VALUE;

        int res=findPath(root,max);

        if(root.left==null || root.right==null) return Math.max(max[0],res);//test case:5 N 6 -5 5 ,when root acts as leaf. 

        return max[0];

    } 

    int findPath(Node node,int max[]){

        if(node==null) return 0;

        int left=findPath(node.left,max);

        int right=findPath(node.right,max);

        // left child is null , rightside sum is -ve/+ve consider that

        if (node.left == null) return right + node.data;

        // right child is null

        if (node.right == null) return left + node.data;

       //max calculates the maximum of max sum path across a node.

        max[0]=(Math.max(left + right + node.data, max[0]));

        // non leaf node

        return Math.max(left, right) + node.data;

    }

}
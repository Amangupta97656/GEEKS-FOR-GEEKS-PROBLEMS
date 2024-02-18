class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(int i=0;i<n;i++){class Solution {
    public static int sumOfLeafNodes(Node root) {
        int[] sum = new int[1]; // Array of size 1 to hold the sum
        sum[0] = 0; // Initialize sum
        preOrder(root, sum);
        return sum[0];
    }

    public static void preOrder(Node root, int[] sum) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            sum[0] += root.data;
            return;
        }

        preOrder(root.left, sum);
        preOrder(root.right, sum);
    }
}
            if((2*i+1<n && arr[i]<arr[2*i+1]) || (2*i+2<n&&arr[i]<arr[2*i+2]))
            return false;
        }
        return true;
    }
}


class Solution {
    public int maxLevelSum(Node root) {
         if (root==null) {

            return 0;

        }

        int max = Integer.MIN_VALUE, currSum;

        Queue<Node> queue = new LinkedList<>();

        

        queue.add(root);

        

        max = Math.max(max,root.data);

        

        while (!queue.isEmpty()) {

            int size = queue.size();

            currSum=0;

            for (int i=0;i<size;i++) {

                Node temp = queue.poll();

                currSum+=temp.data;

                

                if(temp.left!=null) {

                    queue.add(temp.left);

                }

                if(temp.right!=null) {

                    queue.add(temp.right);

                }

            }

            max= Math.max(max,currSum);

        }

        return max;

    }
}


class Solution {
    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
        // code here.
        HashMap<Integer,Integer> tm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        vertical(root,tm,0);
        
        for(int k : tm.keySet())
        {
            min = Math.min(min,k);
            max = Math.max(max,k);
        }
        
        if(min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) return 0;
        if(min >= 0) return max+1;
        if(max <= 0) return (-1)*min+1;
        
        return max-min+1;
    }
    public void vertical(Node root, HashMap<Integer,Integer> tm, int k)
    {
        if(root == null)
        {
            return;
        }
        tm.put(k,root.data);
        
        vertical(root.left,tm,k-1);
        
        vertical(root.right,tm,k+1);
    }
}
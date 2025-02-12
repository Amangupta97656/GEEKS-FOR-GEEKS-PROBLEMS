class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        ArrayList<Integer> arr = new ArrayList<>();
        solve(root,arr);
        if(k <= arr.size())
        {
            for(int i = 0;i<arr.size();i++)
            {
                if(i == k-1)
                {
                   return arr.get(i) ;
                }
            }
        }
       
        return -1;
    }
    
    public void solve(Node root,ArrayList<Integer> arr)
    {
        if(root == null)
        {
            return;
        }
        solve(root.left,arr);
        arr.add(root.data);
        solve(root.right,arr);
    }
}
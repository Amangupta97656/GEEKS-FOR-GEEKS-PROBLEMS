class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int count=0;
    int ans=0;
    public int kthLargest(Node root,int K)
    {
        //Your code here
        reverseinorder(root,K);
        return ans;
    }
    public void reverseinorder(Node root,int K){
        if(root==null)return;
        reverseinorder(root.right,K);
        count++;
        if(count==K){
            ans=root.data;
            return ;
        }
        reverseinorder(root.left,K);
    }
}
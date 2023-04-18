class Quad{
    int sum,size,min,max;
    Quad(int sum,int size,int min,int max){
        this.sum=sum;this.size=size;this.min=min;this.max=max;
    }
}
class Solution {
    int ans=Integer.MAX_VALUE;
    Quad solve(Node root,int target){
        if(root==null)
        return new Quad(0,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        Quad left=solve(root.left,target);
        Quad right=solve(root.right,target);
        int curr=root.data+left.sum+right.sum;
        
        if(root.data>left.max && root.data<right.min){
            if(target==curr){
            ans=Math.min(ans,1+left.size+right.size);
            }
            return new Quad(curr,1+left.size+right.size,
            Math.min(left.min,root.data),Math.max(right.max,root.data));
        }
        return new Quad(0,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public int minSubtreeSumBST(int target, Node root) {
        // code here
        solve(root,target);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}

class Solution

{
    
    
    public  int helper(Node root,int k, int node , int arr[]){
        
        if(root==null){
            return -1;
        }
        // System.out.print(root.data);
        if(root.data==node){
            return 0;
        }
        
        int m=helper(root.left,k,node,arr);
        int n= helper(root.right,k,node,arr);
        
        if(m==-1 && n==-1){
            return -1;
        }
        int max=Math.max(m, n);
        if(max+1==k){
            // System.out.print(root.data);
            arr[0]=root.data;
        }
        return max+1;
    }
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        int arr[]={-1};
        this.helper(root,k,node,arr);
        if(arr[0]>0){
            return arr[0];
        }
        return -1;
        
    }
}
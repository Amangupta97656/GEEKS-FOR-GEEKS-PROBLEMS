class Solution {
    public static void Cal(Node root,int ans,int[] arr){
        if(root==null) return;
        if(root.left==null && root.right==null) {
            arr[0]+=(ans*10+root.data);
            return;
        }
        Cal(root.left,ans*10+root.data,arr);
        Cal(root.right,ans*10+root.data,arr);
    }    
    public static int treePathsSum(Node root) {
      int[] arr = new int[1];
      Cal(root,0,arr);
      return arr[0];
    }
}
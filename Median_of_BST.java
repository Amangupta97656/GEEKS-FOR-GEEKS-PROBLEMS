class Tree
{
    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        int n=arr.size();
         if (n % 2 == 0) {
            int mid1 = arr.get(n / 2);
            int mid2 = arr.get(n / 2 - 1);
            return (float) (mid1 + mid2) / 2;
        } 
        return (float) arr.get(n / 2);
    }
}
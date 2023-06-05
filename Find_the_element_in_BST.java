class Solution
{
    static void inorder(Node root,List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int min=Integer.MAX_VALUE;;
        for(int i=0;i<list.size();i++){
            int val=Math.abs(list.get(i)-K);
            min=Math.min(min,val);
        }
        return min;
    } 

}
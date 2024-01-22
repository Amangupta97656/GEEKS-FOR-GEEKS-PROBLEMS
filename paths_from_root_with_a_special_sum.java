class Solution
{
    public static void rec(Node root, ArrayList<ArrayList<Integer>> ans,int sum,ArrayList<Integer> a,int curr){
        if(root==null) return;
        curr+=root.data;
        a.add(root.data);
        if(curr==sum) ans.add(new ArrayList<>(a));
        rec(root.left,ans,sum,a,curr);
        rec(root.right,ans,sum,a,curr);
        curr-=root.data;
        a.remove(a.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        rec(root,ans,sum,new ArrayList<>(),0);
        return ans;
    }
}
class Solution {
    
   public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        TreeMap<Integer,int[]> hm=new TreeMap<>();
        help(root,0,0,hm);
        for(var i:hm.entrySet()){
            ans.add(i.getValue()[0]);
        }
        return ans;
        
        
    }
    public void help(Node root,int level,int verlevel,TreeMap<Integer,int[]> hm){
        if(root==null)return;
        if(!hm.containsKey(verlevel)||hm.get(verlevel)[1]<=level)hm.put(verlevel,new int[]{root.data,level});
        help(root.left,level+1,verlevel-1,hm);
        help(root.right,level+1,verlevel+1,hm);
    }
}
class Solution
{
    static class pair{
        Node node;
        int level;
        public pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        int leftMost=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        Queue<pair> q=new LinkedList<>();
        q.offer(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            Node temp=p.node;
            int lvl=p.level;
            mp.put(lvl,temp.data);
            leftMost=Math.min(leftMost,lvl);
            if(temp.left!=null){
                q.offer(new pair(temp.left,lvl-1));
            }
            if(temp.right!=null){
                q.offer(new pair(temp.right,lvl+1));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(mp.containsKey(leftMost)){
            ans.add(mp.get(leftMost));
            leftMost++;
        }
        return ans;
    }
}
class Pair{
    int x, y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Solution
{
    //Function to return count of nodes at a given distance from leaf nodes.
    int idx=-5;
    Map<Integer, Pair> hm=new HashMap<>();
    Set<Pair> set=new HashSet<>();
    int printKDistantfromLeaf(Node root, int k)
    {
        if(k==0)return hepler(root);
        help(root, 0, k);
        return set.size();
    }
    void help(Node root,int height, int k){
        if(root==null)return ;
        if(root.left==null && root.right==null){
            if((height-k)>=0){
                set.add(hm.get(height-k));
            }
        }
        hm.put(height, new Pair(idx--, root.data));
        help(root.left, height+1, k);
        help(root.right, height+1, k);
        
    }
    int hepler(Node root){
        int c=0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left==null && temp.right==null){
                c++;
            }
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
        }
        return c;
    }

}
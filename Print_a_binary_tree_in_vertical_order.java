class Tuple{
        Node node;
        int col;
        Tuple(int col,Node node){
            this.node=node;
            this.col=col;
        }
}
class Solution
{
    
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0,root));
        
        while(!q.isEmpty()){
            Tuple curr = q.poll();
           
           if(map.containsKey(curr.col)){
               map.get(curr.col).add(curr.node.data);
           }
           else {
               ArrayList<Integer> temp = new ArrayList<>();
               temp.add(curr.node.data);
               map.put(curr.col ,temp);
           }
           
           if(curr.node.left != null){
               q.add(new Tuple(curr.col - 1 , curr.node.left) );
           }
           if(curr.node.right != null){
               q.add(new Tuple(curr.col + 1 , curr.node.right));
           }
        }
        
        for(int key : map.keySet()){
            for(int num : map.get(key)){
                ans.add(num);
            }
        }
        
        return ans;
    }
}
class Solution
{
    static class Info{
        int hd;
        Node node;
        
        public Info(int hd, Node node){
            this.node = node;
            this.hd = hd;
        }
    }


    static ArrayList<Integer> topView(Node root)
    {

        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();


        int min = 0, max = 0;


        q.add(new Info(0, root));
        q.add(null);


        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }


                if(curr.node.left != null){
                    q.add(new Info(curr.hd-1, curr.node.left));
                    min = Math.min(min, curr.hd-1);
                }


                if(curr.node.right != null){
                    q.add(new Info(curr.hd+1, curr.node.right));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }


        for(int i = min; i <= max; i++){
            ans.add(map.get(i).data);
        }


        return ans;
    }
}
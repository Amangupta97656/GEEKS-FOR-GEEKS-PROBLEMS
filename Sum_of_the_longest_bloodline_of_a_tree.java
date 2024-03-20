class Solution{
    static int maxH;
    Solution(){
        this.maxH = Integer.MIN_VALUE;
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int height=0,sum = 0;
        preorder(root,map,height,sum);
        
        map.forEach((e1,e2)->{
            maxH = Math.max(maxH,e1);
        });
        return map.get(maxH);
    }
    public static void preorder(Node root,HashMap<Integer,Integer> map,int height,int sum){
        if(root==null){
            if(!map.containsKey(height)){
                map.put(height,sum);
            }else{
                if(map.get(height)<sum){
                    map.put(height,sum);
                }
            }
            return;
        }
        preorder(root.left,map,height+1,sum+root.data);
        preorder(root.right,map,height+1,sum+root.data);
        
    }
}
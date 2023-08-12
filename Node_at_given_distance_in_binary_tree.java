class Solution
{

  // finding reference of target node
    private static Node findNode(Node root, int target){
        if(root==null) return null;
        if(root.data==target) return root;
        Node left=findNode(root.left,target);
        Node right=findNode(root.right,target);
        if(left!=null) return left;
        if(right!=null) return right;
        return null;
    }

// store parent node for all nodes into the map
    private static void findParent(HashMap<Node,Node> parentMap,Node root){
        if(root==null) return;
        if(root.left!=null) parentMap.put(root.left,root);
        if(root.right!=null) parentMap.put(root.right,root);
        
        findParent(parentMap,root.left);
        findParent(parentMap,root.right);
    }
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Node,Node> parentMap=new HashMap<>();
        if(root==null) return res;
        findParent(parentMap,root);
        Queue<Node> q=new LinkedList<>();
        Node targetNode=findNode(root,target);
        HashSet<Node> visited=new HashSet<>();
        q.offer(targetNode);
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                visited.add(node);
                
                if(k==0) res.add(node.data);
                
                if(parentMap.containsKey(node) && !visited.contains(parentMap.get(node))){
                    q.offer(parentMap.get(node));
                }
                if(node.left!=null && !visited.contains(node.left)) q.offer(node.left);
                if(node.right!=null && !visited.contains(node.right)) q.offer(node.right);
                
            }
            k--;
            if(k<0) break;
        }
        Collections.sort(res);
        return res;
    }
};
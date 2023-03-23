class Solution
{
 
    static int min = Integer.MAX_VALUE;
    
    public static void minPath(Node a, int currentSum)
    {
        if(a == null) return;
        
        
        currentSum += a.data;
        
        if(a.left == null && a.right == null)
        {
            min = Math.min(min, currentSum);
            
            return;
        }
        
        minPath(a.left, currentSum);
        
        minPath(a.right, currentSum);
    }
    
    public static int maxDifferenceBST(Node root,int target)
    {
        //Please code here
        min = Integer.MAX_VALUE;
        
        Queue<Node> q = new LinkedList<>();
        
        if(root == null) return -1;
        
        q.add(root);
        
        int upperSum = 0;
        
        while(!q.isEmpty())
        {
            Node temp = q.peek();
            
            if(temp == null) return -1;
            
            if(temp.data == target) break;
            
            else if(temp.data > target)
            {
                upperSum += temp.data;
                q.add(temp.left);
            }
            else{
                upperSum += temp.data;
                q.add(temp.right);
            }
            
            q.poll();
            
        }
        
        if(q.isEmpty())
        {
            return -1;
        }
        
        minPath(q.poll(), 0);
        
        min = min - target;
        return upperSum - min;
    }
}
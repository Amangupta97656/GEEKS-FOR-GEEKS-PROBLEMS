class Solution {
    public Node segregate(Node head) {
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;
        Node currNode = head;
        
        while(currNode != null) 
        {
            switch(currNode.data)
            {
                case 0: zeroCnt++; break;
                case 1: oneCnt++;  break;
                case 2: twoCnt++;  break;
            }
            
            currNode = currNode.next;
        }
        
        currNode = head;
        while(currNode != null)
        {
            if(zeroCnt-- > 0) currNode.data = 0;
            else if (oneCnt-- > 0) currNode.data = 1;
            else if (twoCnt-- > 0) currNode.data = 2;
            
            currNode = currNode.next;
        }
        
        return head;
    }
}


class Solution
{
    public Node reverse(Node node)
    {
        Node pre = null;
        while(node!=null)
        {
            Node next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
    
    Node compute(Node head)
    {
        // your code here
        head = reverse(head);
        
        Node pre = null;
        Node crr = head;
        
        int flag = 0;
        
        while(crr!=null)
        {
            if(crr.data<flag)
            {
                pre.next = crr.next;
                crr = crr.next;
                continue;
            }
            
            flag = crr.data;
            
            pre = crr;
            crr = crr.next;
        }
        
        return reverse(head);
    }
}
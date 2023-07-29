 

class Clone 
{
    Node copyList(Node head) 
    {
        HashMap<Node,Node> hm = new HashMap<>();
        
        for(Node curr = head; curr != null;curr = curr.next)
            hm.put(curr,new Node(curr.data));
            
        for(Node curr = head; curr != null; curr = curr.next)
        {
            Node cloneNode = hm.get(curr);
            cloneNode.next = hm.get(curr.next);
            cloneNode.arb = hm.get(curr.arb);
        }
        Node h2 = hm.get(head);
        return h2;
    }
}
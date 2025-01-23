class Solution 
{
    public Node cloneLinkedList(Node head) 
    {
         if (head == null)
        {
            return null;
        }

 

        Node current = head;
        while (current != null) 
        {
            Node copy = new Node(current.data);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

 

        current = head;
        while (current != null) 
        {
            if (current.random != null) 
            {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

 

        Node original = head;
        Node copyHead = head.next;
        Node copy = copyHead;

 

        while (original != null) 
        {
            original.next = original.next.next;
            if (copy.next != null) 
            {
                copy.next = copy.next.next;
            }
            original = original.next;
            copy = copy.next;
        }

 

        return copyHead;
    }
}
class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        if(head == null || head.next == null)
        {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null)
            {
                return null;
            }
            if(slow == fast)
            {
                Node h = head;
                while(h != fast)
                {
                    fast = fast.next;
                    h = h.next;
                }
                return h;
            }
        }
        return null;
    }
}
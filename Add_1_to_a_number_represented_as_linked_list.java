class Solution {
    public static Node addOne(Node head) {
        if (head == null) {
            return null;
        }
        
        head = reverse(head);
        
        Node p = head;
        int carry = 1;
        
        while (p != null) {
            int sum = p.data + carry;
            p.data = sum % 10; // Update the current node's value
            carry = sum / 10;  // Calculate the carry for the next node
            
            //when there is single node create new node for carry
            if (p.next == null && carry > 0) {
                p.next = new Node(carry);
                break;
            }
            
            p = p.next;
        }
        
        head = reverse(head);
        
        return head;
    }
    
    private static Node reverse(Node head) {
        Node prev = null; // previous node
        Node p = head; // current node
        Node r = null; // next node
        
        while (p != null) {
            r = p.next;
            p.next = prev;
            prev = p;
            p = r;
        }
        
        return prev;
    }
}
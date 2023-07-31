class Solution {
    static Node reverseList(Node head)
    {
        Node curr=head,prev=null,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return curr = prev;
    }
    void reorderlist(Node head) {
        if(head == null||head.next==null||head.next.next==null)
            return;
        Node slow=head,fast=head,prev = null,left = head,right=head;
        while(fast!=null&&fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        } 
        if(fast == null)
        {
            prev.next = null;
            right = reverseList(slow);
        }
        else
        {
            right = reverseList(slow.next);
            slow.next = null;
            prev = right;
            while(prev.next!=null)
                prev = prev.next;
            prev.next = slow;
        }
        while(left!=right)
        {
            Node store1 = left.next;
            Node store2 = right.next;
            left.next = right;
            right.next = store1;
            left=store1;
            right = store2;
        }
        if(left!=null)
        left.next = null;
    }
}
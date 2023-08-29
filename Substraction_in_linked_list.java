
class Solution
{
   static Node removeLeadingZeros(Node a)
   {
       if (a != null && a.data == 0)
           return removeLeadingZeros(a.next);
       else
           return a;
   }
    static Node reverse(Node head)
    {
        if(head == null || head.next == null)
            return head; 
        Node prev = null;
        Node temp = null;
        while(head!=null)
        {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    static int getSize(Node head)
    {
        int size = 0;
        while(head!=null)
        {
            size++;
            head = head.next;
        }
        return size;
    }
    static Node subLinkedList(Node l1, Node l2)
    {
        l1 = removeLeadingZeros(l1);
        l2 = removeLeadingZeros(l2);
        int s1 = getSize(l1);
        int s2 = getSize(l2);
        if(s1 < s2)
        {
            Node temp = l1;
            l1 = l2;
            l2 = temp;
        }
        else if(s1 == s2)
        {
            Node p1 = l1;
            Node p2 = l2;
            while(p1!=null && p1.data == p2.data)
            {
                p1 = p1.next;
                p2 = p2.next;
            }
            if(p1 != null && p1.data < p2.data)
            {
                    Node temp = l1;
                    l1 = l2;
                    l2 = temp;
            }
        }
        l1 = reverse(l1);
        l2 = reverse(l2);
        Node dummy = new Node(-1);
        Node itr = dummy;
        Node c1 = l1;
        Node c2 = l2;
        int borrow = 0;
        while(c1!=null)
        {
            int diff = borrow + c1.data - ((c2!=null)?c2.data:0);
            if(diff < 0)
            {
                diff = diff+10;
                borrow = -1;
            }
            else
            {
                borrow = 0;
            }
            if(diff == 0 && c1.next ==null)
            {
                c1 = c1.next;
                continue;
            }
            itr.next = new Node(diff);
            itr = itr.next;
            c1 = c1.next;
            if(c2!=null)
            {
                c2 = c2.next;
            }
        }
        dummy = reverse(dummy.next);
        while(dummy.data == 0 && dummy.next!=null)
            dummy = dummy.next;
        return dummy;
    }
}
class Solution
{
    public static void rearrange(Node start)
    {
        if(start.next == null){
            return;
        }
        Node odd = start;
        Node even = start.next;
        Node second = even;
        if(even.next == null){
            return ;
        }
        
        Node p_e = null;
        if(even.next.next!=null){
            p_e = even.next.next;
        }else{
            odd.next = even.next;
            odd = odd.next;
            odd.next = even;
            // odd.next = null;
            even.next = null;
            return ;
        }
        //separate the linked list
        while(p_e!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = p_e;
            even = even.next;
            if(p_e.next!=null && p_e.next.next==null){
                odd.next = p_e.next;
                odd = odd.next;
                break;
            }else if(p_e.next==null){
                p_e = p_e.next;   
            }else{
                p_e = p_e.next.next;
            }
        }
        odd.next = null;
        even.next = null;
        
        //reverse the odd linked-list
        Node p = second;
        Node q = second.next;
        p.next = null;
        Node temp = null;
        while(q!=null){
            temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        second = p;
        odd.next = second;
    }
}

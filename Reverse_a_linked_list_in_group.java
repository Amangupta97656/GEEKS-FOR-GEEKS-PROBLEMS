class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // Your code here
        if(head==null || head.next==null) return head;
        Node t=head,n=null,p=null;
        while(t!=null){
            int l=1;
            while(t.next!=null && l<k){
                t=t.next;
                l++;
            }
            if(p!=null) p.next=t;
            if(n==null){
                p=head;
                head=t;
            }
            else p=n;
            n=t.next;
            t.next=null;
            reverse(p);
            p.next=n;
            t=n;
        }
        return head;
    }
    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node t=head,p=null;
        while(t!=null){
            Node n =t.next;
            t.next=p;
            p=t;
            t=n;
        }
        return p;
    }
}
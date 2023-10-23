class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        Node mark=null;
        Node head1=head;
        while(head1.next!=null){
            k--;
            if(k==0){
                mark=head1;
            }
            head1=head1.next;
        }
        if(k>0 || mark==head1){
            return head;
        }
        
        head1.next=head;
        Node n=mark.next;
        mark.next=null;
        return n;
    }
}
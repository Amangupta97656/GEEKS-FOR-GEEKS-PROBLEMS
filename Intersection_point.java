class Intersect {
    int intersectPoint(Node head1, Node head2) {

     while(head1!=null){
         head1.data+=(-40000);
         head1=head1.next;
     }
     while(head2!=null){
         if(head2.data<-10000) return head2.data+40000;
         head2=head2.next;
     }
     return -1;
}}
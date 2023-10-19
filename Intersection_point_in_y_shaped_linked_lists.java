class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
    static Node trav(Node head,int diff){
        while(diff>0){
            head=head.next;
            diff--;
        }
        return head;
    }
    static int intersect(Node head1,Node head2){
        //for same size only
        while(head1!=null){
            if(head1==head2){
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return -1;
    }
	int intersectPoint(Node head1, Node head2){
	     if(head1==null || head2==null){
	         return -1;
	     }
         int c1=0,c2=0;//count
         Node curr1=head1,curr2=head2;
         while(curr1!=null || curr2!=null){
             if(curr1!=null){
                 c1++;
                 curr1=curr1.next;
             }
             if(curr2!=null){
                 c2++;
                 curr2=curr2.next;
             }
         }
         Node n=null;
         if(c1>c2){
             n=trav(head1,c1-c2);
             return intersect(n,head2);
         }
         else if(c2>c1){
             n=trav(head2,c2-c1);
             return intersect(head1,n);
         }
         else{
             return intersect(head1,head2);
         }
	}
}
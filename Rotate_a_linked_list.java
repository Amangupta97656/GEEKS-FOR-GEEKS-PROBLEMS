class Solution {
    // Function to rotate a linked list.
    int count=0;
    Node p=null;
    Node l=null;
    Node q=null;
    
    public Node rotate(Node head, int k) {
       
        //base case
        if(count==0){
            p=head;
        }
        //base case according to recursion
        if(head.next==null){
            if(count==k){
                head.next=p;
                l.next=null;
                return head;
            }else if(k>count){
                return p;
            }
            head.next=p;
           l.next=null;
            return q;
        }
        //according to condition
        if(count==k-1){
           l=head;
       }
        //according to condition
        if(count==k){
            q=head;
        }
            count++;
            //recursion call
            return rotate(head.next,k);
    }
      
}
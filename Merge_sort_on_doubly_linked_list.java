class Solution {
    static Node merge(Node h1, Node h2){
        Node temp =new Node(-1);
        Node head=temp;
        
        while(h1!=null && h2!=null){
            if(h1.data<h2.data){
                temp.next=h1;
                h1.prev=temp;
                h1=h1.next;
            }
            else{
                temp.next=h2;
                h2.prev=temp;
                h2=h2.next;
            }
            temp=temp.next;
        }
        while(h1!=null){
            temp.next=h1;
            h1.prev=temp;
            h1=h1.next;
            temp=temp.next;
        }
        while(h2!=null){
            temp.next=h2;
            h2.prev=temp;
            h2=h2.next;
            temp=temp.next;
        }
        head.next.prev=null;
        return head.next;
    }
    
    static Node sortDoubly(Node head) {
        if(head.next == null){
            return head;
        }
        Node mid =findmid(head);
        Node head2=mid.next;
        mid.next=null;
        mid.prev=null;
        
        Node left =sortDoubly(head);
        Node right =sortDoubly(head2);
        
        Node ans = merge(left,right);
        
        return ans;
        
    }
    
    static Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
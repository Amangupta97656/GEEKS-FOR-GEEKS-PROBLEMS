class Solution {
    public void deleteAlt(Node head) {
        Node temp=head; 
        while(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
    }
}


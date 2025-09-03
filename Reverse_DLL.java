class Solution {
    public Node reverse(Node head) {
        // code here
        Node cur=head;
        Node hu=null;
        while(cur!=null){
            Node t=cur.next;
            cur.next=cur.prev;
            cur.prev=t;
            hu=cur;
            cur=cur.prev;
        }
        return hu;
    }
}
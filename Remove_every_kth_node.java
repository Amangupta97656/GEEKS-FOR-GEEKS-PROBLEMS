class Solution
{
    Node delete(Node head, int k)
    {
        if(k==1)
            return null;
        int i=1;
        Node cur=head;
        while(cur!=null && cur.next!=null)
        {
            if(i==k-1)
            {
                cur.next=cur.next.next;
                cur=cur.next; //if we update cur here then no need to set i to 0.
                i=1; // set i to 1 since cur is moved.
                
            }
            else
            {
               cur=cur.next;
               i++;
            }
        }
        return head;
    }
}
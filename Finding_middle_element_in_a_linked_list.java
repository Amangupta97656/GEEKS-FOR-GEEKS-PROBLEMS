class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         if(head==null)
          return -1;
          Node temp=head;
          int len =0;
          while(temp!=null)
          {
              len++;
              temp=temp.next;
          }
          len=len/2;
          Node curr=head;
          for(int i=0;i<len;i++)
             {
                 curr=curr.next;
             }
          return curr.data;  
    }
}
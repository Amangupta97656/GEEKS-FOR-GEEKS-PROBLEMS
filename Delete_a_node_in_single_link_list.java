class GfG
{
    Node deleteNode(Node head, int x)
    {
if(x == 1){
        
        return head.next;
    }
    
      Node temp = head;
      
      int i=1;
      while(i < x-1){
          temp = temp.next;
          i++;
      }
      
      temp.next = temp.next.next;
      
      return head;
    }
}

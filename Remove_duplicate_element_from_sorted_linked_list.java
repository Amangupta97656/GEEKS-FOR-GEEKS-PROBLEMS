class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
// Your code here
   Node temp = head;
   
   while(temp.next!=null){
       if(temp.data == temp.next.data){
           temp.next = temp.next.next;
           
       }
       else{
           temp  = temp.next;
           
       }
   }
   return head;
 
 
    }
}
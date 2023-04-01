class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
          if(head == null || head.next == null){
            return false;  //Presence of one single node in the Linked List 
        } 
        
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
}
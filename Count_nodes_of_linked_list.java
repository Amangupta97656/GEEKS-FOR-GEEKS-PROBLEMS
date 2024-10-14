
class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        
        Node temp = head;
        int count =0;
        while(temp!= null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
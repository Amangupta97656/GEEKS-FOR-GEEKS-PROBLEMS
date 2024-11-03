class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        Node start = head;     
        while(start!=null && start.next!=null){
            start = start.next.next;;
        }   
        return start==null;
    }
}
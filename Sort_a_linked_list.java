class Solution {
    static Node segregate(Node head) {
        Node start = head;
        Node ptr = head;
        
        int onesCount = 0;
        
        while (ptr != null) {
            if (ptr.data == 1) {
                onesCount++;
            } else if (ptr.data == 0) {
                start.data = 0;
                start = start.next;
            }
            ptr = ptr.next;
        }
        
        ptr = start;
        while (ptr != null) {
            if (onesCount == 0) {
                ptr.data = 2;
            } else {
                ptr.data = 1;
                onesCount--;
            }
            ptr = ptr.next;
        }
        
        return head;
    }
}
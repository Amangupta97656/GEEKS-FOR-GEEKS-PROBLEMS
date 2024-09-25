class Solution {
    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true; 
        Node slow = head, fast = head;
        LinkedList<Integer> stack = new LinkedList<>();
        while (fast != null && fast.next != null) {
            stack.push(slow.data); 
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (stack.pop() != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
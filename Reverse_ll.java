// Definition for singly-linked list node
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;

        while (head != null) {
            // Find the kth node in the group
            Node kth = getKthNode(head, k);
            if (kth == null) {
                // reverse the last group even if < k
                prevGroupEnd.next = reverseList(head, null);
                break;
            }

            Node nextGroupStart = kth.next;

            // Reverse the current group
            Node newHead = reverseList(head, nextGroupStart);

            // Connect with previous part
            prevGroupEnd.next = newHead;
            prevGroupEnd = head;
            head = nextGroupStart;
        }

        return dummy.next;
    }

    // Helper: get kth node from start (or null if less than k nodes)
    private static Node getKthNode(Node head, int k) {
        Node curr = head;
        for (int i = 1; i < k && curr != null; i++) {
            curr = curr.next;
        }
        return curr;
    }

    // Helper: reverse list till end node
    private static Node reverseList(Node head, Node stop) {
        Node prev = stop, curr = head;
        while (curr != stop) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}

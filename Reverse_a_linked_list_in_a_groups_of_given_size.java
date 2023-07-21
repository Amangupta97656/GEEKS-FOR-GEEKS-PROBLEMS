
class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node current = node;
        Node prevTail = null;
        Node newHead = null;

        while (current != null) {
            int count = 0;
            Node groupHead = current;
            Node prev = null;

            while (current != null && count < k) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
                count++;
            }

            if (prevTail == null) {
                newHead = prev;
            } else {
              
                prevTail.next = prev;
            }

            prevTail = groupHead;
        }

        return newHead;
    }
}
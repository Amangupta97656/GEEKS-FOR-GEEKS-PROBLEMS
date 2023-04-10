class Solution
{
     public static void removeLoop(Node head){
         boolean flag = false;
        Node p = head, q = head;
        while (p.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
            if (q.next == null) break;
            if (p == q) {
                flag = true;
                break;
            }
        }
        if (flag) {
            p = head;
            while (true) {
                if (p == q) break;
                p = p.next;
                q = q.next;
            }
            while (q.next != p) q = q.next;
            q.next = null;
        }
    }
}
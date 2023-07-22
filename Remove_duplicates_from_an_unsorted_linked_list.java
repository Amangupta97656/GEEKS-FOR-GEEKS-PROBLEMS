
class Solution
{
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> set= new HashSet<>();
        Node node=head, prev=head;
        while(node!=null) {
            if(!set.isEmpty() && set.contains(node.data)) {
                prev.next=node.next;
                node=prev.next;
            } else {
                set.add(node.data);
                prev=node;
                node=node.next;
            }
        }
        return head;
    }
}

class Solution {
    public Node sortedInsert(Node head, int data) {
        Node insertNode = new Node(data);
        Node temp = head;
        if(head == null){
            insertNode.next = insertNode;
            return insertNode;
        }
        if(head.data>data){
            while(temp.next != head)temp = temp.next;
            insertNode.next = head;temp.next = insertNode;
            return insertNode;
        }
        while(temp.next != head && temp.next.data<=data)temp = temp.next;
        insertNode.next =  temp.next;temp.next = insertNode;
        return head;
    }
}
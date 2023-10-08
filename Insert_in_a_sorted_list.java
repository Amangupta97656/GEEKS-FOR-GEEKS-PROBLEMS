class Solution {
    Node sortedInsert(Node start, int key) {
        Node p = start;
        Node temp = new Node(key);
        
        //for first Node
        if(key<p.data){
            temp.next = p;
            start = temp;
            return start;
        }
        //rest of all nodes.
        p = p.next;
        Node prev = start;
        while(p!=null){
            if(key<p.data){
                prev.next = temp;
                temp.next = p;
                return start;
            }
            prev = p;
            p = p.next;
        }
        prev.next = temp;
        return start;
    }
}
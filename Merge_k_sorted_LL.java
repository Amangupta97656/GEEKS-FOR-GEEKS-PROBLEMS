class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(Node node :arr)
        {
            while(node!=null)
            {
                pq.add(node.data);
                node=node.next;
            }
        }
        Node dummy = new Node(-1);
        Node tmp =dummy;
        while(!pq.isEmpty())
        {
            Node node=new Node(pq.poll());
            tmp.next=node;
            tmp=tmp.next;
        }
        return dummy.next;
    }
}


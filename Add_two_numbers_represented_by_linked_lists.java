class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node temp1 = reverseFun(first);
        Node temp2 = reverseFun(second);
        
        Node node1 = new Node(0);
        Node node2 = node1;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int num1 = (temp1 != null) ? temp1.data : 0;
            int num2 = (temp2 != null) ? temp2.data : 0;
            int sum = carry + num1 + num2;
            carry = sum  / 10;
            node2.next = new Node(sum % 10);
            node2 = node2.next;
            if(temp1 != null)
                temp1 = temp1.next;
            
            if(temp2 != null)
                temp2 = temp2.next;
        }
        if(carry > 0)
            node2.next = new Node(carry);
            
            Node result = reverseFun(node1.next);
            
            return result;
    }
    
    static Node reverseFun(Node head){
        Node current = head;
        Node prevs = null;
        Node nextNode = null;
        while(current != null){
            nextNode = current.next;
            current.next = prevs;
            prevs = current;
            current = nextNode;
        }
        return prevs;
    }
}
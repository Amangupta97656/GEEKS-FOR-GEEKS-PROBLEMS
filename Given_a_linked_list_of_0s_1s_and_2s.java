class Solution
{
 static Node segregate(Node head)
    {
        // add your code here
        int c0 = 0, c1 = 0, c2 = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                c0++;
            } else if(temp.data == 1){
                c1++;
            } else {
                c2++;
            }
            temp = temp.next;
        }
        temp = null;
        for(int i=0; i<c0; i++){
            Node a = new Node(0);
            if(temp == null){
                temp = a; 
                head = temp;
            }
            else {
                temp.next = a;
                temp = temp.next;
            }
        }
        for(int i=c0; i<c0+c1; i++){
            Node a = new Node(1);
            if(temp == null){
                temp = a;
                head = temp;
            }
            else {
                temp.next = a;
                temp = temp.next;
            }
        }
        for(int i=c0+c1; i<c0+c1+c2; i++){
            Node a = new Node(2);
            if(temp == null){
                temp = a; 
                head = temp;
            }
            else {
                temp.next = a;
                temp = temp.next;
            }
        }
        return head;
    }
}


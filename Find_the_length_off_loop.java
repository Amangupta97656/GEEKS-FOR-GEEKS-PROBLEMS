class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        int ans=0;
        Node slow=head;
        Node fast=head;
        while(fast!=null && slow!=null){
            fast=fast.next;
            if(fast==null) break;
            slow=slow.next;
            fast=fast.next;
            if(fast==null) break;
            if(fast==slow){
                do{
                    ans++;
                    slow=slow.next;
                }while(fast!=slow);
                break;
            }
        }
        return ans;
    }
}
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
         int size=0;
        Node temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        if(size<n)
            return -1;
        
        int reqElePos = size-n;
        Node reqEle = head;
        for(int i=0;i<reqElePos;i++)
        {
            reqEle = reqEle.next;
        }
        return reqEle.data;
    }
}

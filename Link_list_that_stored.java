class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node p=head;
        int n=0;
        while(p!=null)
        {
            n++;
            p=p.next;
        }
        int arr[]=new int[n];
        int f=0;
        int b=n-1;
        Node pt=head;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                arr[f]=pt.data;
                pt=pt.next;
                f++;
            }
            else
            {
                arr[b]=pt.data;
                pt=pt.next;
                b--;
            }
        }
        Arrays.sort(arr);
        Node h=head;
        for(int i=0;i<n;i++)
        {
            h.data=arr[i];
            h=h.next;
        }
        return head;
   }

}
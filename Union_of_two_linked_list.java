class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
    ArrayList<Integer> l1 = new ArrayList<>();
        
        while(head1!=null){
            l1.add(head1.data);
            head1=head1.next;
        } 
        while(head2!=null){
            l1.add(head2.data);
            head2=head2.next;
        } 
        
        Collections.sort(l1);
        Node headnew=new Node(l1.get(0));
        Node temp=headnew;
        
        for(int i : l1){
            if(temp.data!=i){
                temp.next= new Node(i);
                temp=temp.next;
            }
        }
        
        return headnew;
    }
}
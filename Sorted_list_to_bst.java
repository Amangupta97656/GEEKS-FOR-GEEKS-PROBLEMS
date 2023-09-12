class Solution
{
    public TNode sortedListToBST(LNode head)
    {
        //code here
        List<Integer>l=new ArrayList<>();
        while(head!=null){
            l.add(head.data);
            head=head.next;
        }
        
        return merge(l);
    }
    public static TNode merge(List<Integer> l){
        if(l.size()==1)
        return new TNode(l.get(0));
        int mid=l.size()/2;
        TNode root=new TNode(l.get(mid));
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        try{
        left=l.subList(0,mid);
        }
        catch (Exception e){
            return root;
        }
        try{
        right=l.subList(mid+1,l.size());
        }
        catch(Exception e){
            return root;
        }
        if(left.size()!=0)
        root.left=merge(left);
        if(right.size()!=0)
        root.right=merge(right);
        
        return root;
    } 
}
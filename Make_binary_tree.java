class Solution {
    public Tree convert(Node head, Tree node) {
        if(head.next==null) return new Tree(head.data);   
        
        Node temp=head.next;
        Queue<Tree> q=new LinkedList<>();
        q.offer(new Tree(head.data));
        boolean flag=false;
        Tree ans=new Tree(-1);
        
        while(!q.isEmpty()){
    
                Tree m=q.poll();
                if(flag==false){
                    ans.left=m;
                    flag=true;
                }
                
                if(temp!=null){
                    Tree t=new Tree(temp.data);
                    q.offer(t);
                    m.left=t;
                    temp=temp.next;
                }
                
                if(temp!=null){
                    Tree t=new Tree(temp.data);
                    q.offer(t);
                    m.right=t;
                    temp=temp.next;
            }
                
        }        
        return ans.left;
    }
}
class Solution
{
    static int idx=0;
    public static Node build(int s1,int e1,int in[],int pre[]){
        
        if(e1<s1||idx>=in.length) return null;
        
        Node newNode=new Node(pre[idx]);
        idx++;
        int mid = 0;
        
        for(int i=s1;i<=e1;i++){
            
            if(in[i]==newNode.data){
                
                mid=i;
                break;
            }
        }
        newNode.left = build(s1,mid-1,in,pre);
        
        newNode.right = build(mid+1,e1,in,pre);
        
        return newNode;
    }
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        idx=0;
        return build(0,inorder.length-1,inorder,preorder);
    }
}
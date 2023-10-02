class Solution
{
    public static Node reverseBetween(Node head, int m, int n)
    {
        Node curr=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(curr!=null){
            arr.add(curr.data);
            curr=curr.next;
            
        }
        int i=m-1,j=n-1;
        while(i<j){
            int tem=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,tem);
            i++;
            j--;
        }
        curr=head;
        for(int k=0;k<arr.size();k++){
            curr.data=arr.get(k);
            curr=curr.next;
        }
        return head;
    }

    }
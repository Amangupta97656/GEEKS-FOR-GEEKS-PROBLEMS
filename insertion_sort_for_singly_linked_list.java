class Solution
{
    public static Node insertionSort(Node start)
    {
        Node ans = start;
        Node first = start;
        while(first!=null){
            Node p = first;
            Node second = first.next;
            while(second!=null){
               if(p.data>second.data){
                   p = second;
               }
               second = second.next;
            }
            if(first!=p){
                int temp = p.data;
                p.data = first.data;
                first.data = temp;
            }
            first = first.next;
        }
        return ans;
    }
}
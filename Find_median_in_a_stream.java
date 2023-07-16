class Solution
{
    static PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> higher = new PriorityQueue<>();
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here
        if(lower.size() == higher.size()){
            higher.add(x);
            lower.add(higher.remove());
        }
        else{
            lower.add(x);
            higher.add(lower.remove());
        }
    }
    
    
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(lower.size()==higher.size()){
            return (lower.peek()+higher.peek())/2.0;
        }
        else return (double)lower.peek();
    }
    
}
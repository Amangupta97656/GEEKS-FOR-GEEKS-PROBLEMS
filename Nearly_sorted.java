class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        int n = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int a : arr){
            pq.offer(a);
        }
        
        for(int i = 0;i < n;i++){
            arr[i] = pq.poll();
        }
        
    }
}
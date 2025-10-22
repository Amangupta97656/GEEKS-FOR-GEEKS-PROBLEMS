class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
         PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        
        for(int i=0; i<=k; i++){
            // insert k elements from starting into pq
            pq.offer(arr[i]);
        }
        
        int index = 0; // for filling up the arr in sorted order
        for(int i=k+1; i<arr.length; i++){
            arr[index++] = pq.poll(); // extract min and store in arr
            pq.add(arr[i]); // also store the next element in pq for further processing
        }
        
        while(!pq.isEmpty()){
            // store the remaining elements to arr
            arr[index++] = pq.poll();
        }
    
    }
}


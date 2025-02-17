class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>
        (Collections.reverseOrder());
        
        for(int i =0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        
        while(!pq.isEmpty()){
            if(k!=0){
                list.add(pq.poll());
                k--;
            }
            else{
                break;
            }
        }
        
        return list;
    }
}
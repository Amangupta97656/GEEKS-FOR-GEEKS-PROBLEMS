class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> {
            if(a[1]==b[1]) return Integer.compare(b[0],a[0]);
            else return Integer.compare(b[1],a[1]);
        });
        
        Arrays.sort(arr);
        int ct=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                pq.add(new int[]{arr[i-1],ct});
                ct=1;
            }else ct++;
        }
        
        if (arr.length > 0)
            pq.add(new int[]{arr[arr.length - 1], ct});

        
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++) ans.add(pq.poll()[0]);
        
        return ans;
    }
}
class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        HashMap<Integer, Integer>hm = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            int key = arr[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        int minFreq=Integer.MAX_VALUE, key=0;
        for(Map.Entry<Integer, Integer> entry:hm.entrySet()){
            
            if(entry.getValue()==minFreq && entry.getKey()>key){
                    key=entry.getKey();
            }
            if(entry.getValue()<minFreq){
                key=entry.getKey();
                minFreq = entry.getValue();
            }
        }
        return key;
    }
}
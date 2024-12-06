class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        int len  = citations.length;
        int[] bucket = new int[len+1];
        for(int c : citations){
            bucket[Math.min(c, len)]++;
        }
        int count = 0;
         for(int i = len; i>= 0; i--){
             count +=bucket[i];
             if(count >= i){
             return i;
         }
      }
    return 0;
    }
}
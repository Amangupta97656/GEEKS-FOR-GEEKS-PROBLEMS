class Solution {
    public int getSingle(int[] arr) {
        // code here
        int ans=0;
        for(int bitIndex=0;bitIndex<32;bitIndex++){
            int cnt=0;
            for(int i=0;i<arr.length;i++){
                if((arr[i]&(1<<bitIndex))!=0){
                    cnt++;
                }
            }
            if(cnt%3!=0){
                ans=ans|(1<<bitIndex);
            }
        }
        return ans;
    }
}
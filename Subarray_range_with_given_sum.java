class Solution {
    static int subArraySum(int arr[], int tar) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int sum = 0;
        int ans = 0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(hm.containsKey(sum-tar)){
                ans = ans + hm.get(sum-tar);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
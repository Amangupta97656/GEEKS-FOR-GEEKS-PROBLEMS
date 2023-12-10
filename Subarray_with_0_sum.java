class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(0, true);
        
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
            if(map.containsKey(sum)) {
                return true;
            }else {
                map.put(sum, true);
            }
        }
        return false;
    }
}
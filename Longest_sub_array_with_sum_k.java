class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        for(int i =1 ; i < N ; i++){
            A[i] += A[i-1];
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i =0 ; i < N ; i++){
            int val = A[i]-K;
            if(map.containsKey(val)){
                int index = i-map.get(val);
                max = Math.max(max, index);
            }
            if(map.containsKey(A[i])){
               continue;
            }else{
                map.put(A[i] , i);
            }
            
        }
        return max;
    }
    
    
}
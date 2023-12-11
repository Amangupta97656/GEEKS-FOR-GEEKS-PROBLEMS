class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long currSum=0,  maxSum=0;
        if(K>N){
            return -1;
        }
        for(int i=0;i<K;i++){
            currSum += Arr.get(i);
        }
        maxSum=currSum;
        for(int i=K;i<N;i++){
            currSum = currSum - Arr.get(i - K) + Arr.get(i);
            // Update maxSum if the currentSum is greater
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
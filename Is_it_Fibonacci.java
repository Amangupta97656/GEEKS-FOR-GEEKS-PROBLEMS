class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
    for(int i = K; i < N; i++){
            long sum = 0;
            
            for(int j = GeekNum.size() - K; j < GeekNum.size(); j++){
            sum += GeekNum.get(j);
            
            }
            
            GeekNum.add(sum);
        }
        
        return GeekNum.get(N-1);
    }
}
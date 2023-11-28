class Solution {
    int sumOfDependencies(ArrayList<ArrayList<Integer>> adj, int V) {
        int sum=0;
        
        for(int i=0;i<V;i++){
            for(Integer it:adj.get(i)){
                sum++;
            }
        }
        return sum;
    }
};
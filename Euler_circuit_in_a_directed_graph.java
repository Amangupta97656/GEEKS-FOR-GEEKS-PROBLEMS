class Solution {
    public boolean isEularCircuitExist(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        for(ArrayList<Integer> al: adj){
            if(al.size()%2!=0) return  false;
        }
        return true;
    }
}
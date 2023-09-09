class Solution {
    static void helper(Node n, int l, HashMap<Integer,ArrayList<Integer>> hm){
        if(n == null){
            return;
        }
        hm.computeIfAbsent(l,k -> new ArrayList<Integer>()).add(n.data);
        helper(n.left,l+1,hm);
        helper(n.right,l+1,hm);
    }
    public static boolean areAnagrams(Node node1, Node node2) {
        // code here
        HashMap<Integer,ArrayList<Integer>> hm1 = new HashMap<>();
        HashMap<Integer,ArrayList<Integer>> hm2 = new HashMap<>();
        helper(node1,0,hm1);
        helper(node2,0,hm2);
        if(hm1.size()!=hm2.size()){
            return false;
        }
        for(int i=0;i<hm1.size();i++){
            ArrayList<Integer> t1 = hm1.get(i);
            ArrayList<Integer> t2 = hm2.get(i);
            
            if(t1.size()!=t2.size()){
                return false;
            }
            if(t1.size()>1){
                Collections.sort(t1);
                Collections.sort(t2);
            }
            String s1 = "";
            String s2 = "";
            
            for(int j=0;j<t1.size();j++){
                s1+=(t1.get(j)+" ");
                s2+=(t2.get(j)+" ");
            }
            if(!s1.equals(s2)){
                return false;
            }
        }
        return true;
    }
}
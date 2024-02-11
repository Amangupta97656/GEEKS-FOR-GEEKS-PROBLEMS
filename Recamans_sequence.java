class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        list.add(0);
        set.add(0);
        
        for(int i=1; i<n; i++){
            if(list.get(i-1)-i > 0 && set.contains(list.get(i-1)-i) == false){
                list.add(list.get(i-1)-i);
                set.add(list.get(i-1)-i);
            }
            else{
                list.add(list.get(i-1)+i);
                set.add(list.get(i-1)+i);
            }
        }
        return list;
    }
}
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        Map<Integer ,Integer> m=new HashMap<>();
        int n=arr.length/3;
         ArrayList<Integer> l=new  ArrayList<>();
        for(int a:arr){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        
        for(int k:m.keySet()){
            
            if(m.get(k)>n){
                l.add(k);
            }
        }
        
          Collections.sort(l);
        
        return l;
    }
}
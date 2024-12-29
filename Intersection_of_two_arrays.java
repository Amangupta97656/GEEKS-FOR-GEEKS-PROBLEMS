class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> hm = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            hm.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(hm.contains(b[i])){
                arr.add(b[i]);
                hm.remove(b[i]);
            }
        }
        return arr;
        
    }
}


class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        Set<Integer> s = new HashSet<>();
        for(int i : arr){
            s.add(i);
        }
        
        int[] arr2 = new int[k];
        
        int temp = 1;
        int x = 0;
        
        while(x<k){
            if(s.contains(temp)){
                temp++;
            }
            else{
                arr2[x] = temp;
                x++;
                temp++;
            }
        }
        
        return arr2[arr2.length-1];
    }
}
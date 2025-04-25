class Solution {
    static int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int times=n/2;
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i : arr)
       {
           hm.put(i,hm.getOrDefault(i,0)+1);
       }
       for(int i : hm.keySet())
       {
           if(hm.get(i)>times)
           return i;
       }
       return -1;
    }
}
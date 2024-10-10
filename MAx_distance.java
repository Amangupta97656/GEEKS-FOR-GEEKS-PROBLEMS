class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
     
      int res=0;
      for(int i=0;i<arr.length;i++)
      {
          if(!h1.containsKey(arr[i]))
          {
              h1.put(arr[i],i);
          }
          else
          {
              res=Math.max(res,i-h1.get(arr[i]));
          }
      }
      return res;
    }
}
class Solution{
    public static int appleSequence(int n, int m, String arr){
       int curr = 0, prev = 0;
        int count = 0;
        int ans = 0;
        while(curr < n)
        {
           if(arr.charAt(curr) == 'A')
           {
               ans = Math.max(ans, (curr-prev) + 1);
           }
           else if(arr.charAt(curr) == 'O' && count < m)
           {
               ans = Math.max(ans, (curr-prev)+1);
               count++;
           }
           else
           {
               while(arr.charAt(prev) == 'A')
               {
                   prev++;
               }
               prev++;
           }
           curr++;
        }
        return ans;
    }
}
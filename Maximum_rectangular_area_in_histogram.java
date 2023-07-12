
class Solution
{
  public static long getMaxArea(long his[], long n) 
    {
        int n1 = (int)n;
        int ngr[] = new int[n1];
        int ngl[] = new int[n1];
        Stack<Integer> st = new Stack<>();
        for(int i=n1-1; i>=0; i--){
            while(!st.isEmpty() && his[st.peek()] >= his[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ngr[i] = n1;
            }else{
                ngr[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=0; i<n1; i++){
            while(!st.isEmpty() && his[st.peek()] >= his[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ngl[i] = -1;
            }else{
                ngl[i] = st.peek();
            }
            st.push(i);
        }
        long ans = Long.MIN_VALUE;
        for(int i=0; i<n1; i++){
            ans = Math.max(ans, (ngr[i] - ngl[i] - 1 ) * his[i]); 
        }
        return ans;
    }
}
class Solution{
    static Set<String> st;
    static{
        st = new HashSet<>();
        long p = 1; 
        for(int i = 1;i <= 22;i++){
            st.add(Long.toString(p,2));
            p *= 5;
        }
    }
    static int max = (int)1e9;
    static int helper(String s,int idx){
        if(idx >= s.length()) return 0;
        StringBuilder sb = new StringBuilder();
        int ans = max;
        for(int i = idx;i < s.length();i++){
            sb.append(s.charAt(i));
            if(st.contains(sb.toString())){
                ans = Math.min(ans,1 + helper(s,i + 1));
            }
        }
        return ans;
    }
    static int cuts(String s){
        int ans = helper(s,0);
        return ans >= max ? -1 : ans;
    }
}
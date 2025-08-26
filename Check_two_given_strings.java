class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch: s1.toCharArray()){
            st.push(ch);
        }
        int n = s2.length();
        for(int i=n-1;i>=0;i--){
            if(st.empty()){ return true;}
            if(s2.charAt(i) == st.peek()){
                st.pop();
            }
        }
        return st.empty();
    }
};
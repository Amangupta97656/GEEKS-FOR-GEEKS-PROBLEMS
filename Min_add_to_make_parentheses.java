class Solution {
    public int minParentheses(String s) {
        // code here
        int c=0;
        int ans=0;
        
        for (int i=0; i<s.length(); i++) {
            
            if (s.charAt(i) == '(') c++;
            else if (s.charAt(i) == ')') c--;
            
            if (c<0) {
                ans += (-1*c);
                c=0;
            }
        }
        return ans+c;
        
    }
}
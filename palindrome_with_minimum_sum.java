class Solution {
    public static int minimumSum(String S) {
        // code here
        char [] s = S.toCharArray();
        
        int l = 0;
        int r = s.length -1;
        
        while(l<r){
            if(s[l] == s[r]) {
                l++;
                r--;
                continue;
            }
            else if(s[l] == '?' &&  s[r] != '?') s[l] = s[r];
            else if(s[l] != '?' && s[r] == '?') s[r] = s[l];
            else return -1;
            l++;
            r--;
        }
        int diff = 0;
        
        char curr = s[0];
        char prev = s[0];
        // for(char i : s) System.out.print(i);
        for(int i = 0; i<=s.length/2;i++){
            if(s[i]!='?') {
                prev = curr;
                curr = s[i];
                if(prev!= '?')diff += Math.abs(prev- curr);
            }
            
        }
        return 2*diff;
    }
}
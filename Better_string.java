class Solution {
    public static String betterString(String str1, String str2) {
        int first = countDistrinctSubsequence(str1);
        int second = countDistrinctSubsequence(str2);
        if(first>=second){
            return str1;
        }else{
            return str2;
        }
    }
    public static int countDistrinctSubsequence(String s){
        
        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        
        int ch[] = new int[26];
        
        for(int i=1;i<dp.length;i++){
            int val = ch[s.charAt(i-1)-'a'];
            dp[i] = ((2 * dp[i-1])) - val;
            ch[s.charAt(i-1) - 'a'] = dp[i-1];
        }
        int ans = dp[s.length()];
        return ans;
    }
}
class Solution {
    int distinctSubsequences(String S) {
        int mo=1000000007;
        int n=S.length();
        int dp[]=new int[n+1];
        dp[0]=1;
        HashMap<Character ,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            
            dp[i]=(2*dp[i-1])%mo;
            char ch=S.charAt(i-1);
            if(map.containsKey(ch)){
                int j=map.get(ch);
                dp[i]=(dp[i]-dp[j-1]+mo)%mo;
            }
            map.put(ch,i);
        }
        return dp[n];
    }
}
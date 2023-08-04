class Solution
{    public  int isMatching(String s,String p){
    int n=s.length();
    int m=p.length();
    int dp[][]=new int[n+1][m+1];
    //initialize
    dp[0][0]=1;
    for(int i=1;i<n+1;i++){
        dp[i][0]=0;
    }
    for(int j=1;j<m+1;j++){
        if(p.charAt(j-1)=='*'){
            dp[0][j]=dp[0][j-1];
        }
    }
    //bottom up
    for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
            //case1 -> ith char == jth char || jth char == ?
            if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                dp[i][j]=dp[i-1][j-1];
            }
            //case2 -> 
            else if(p.charAt(j-1)=='*'){
                dp[i][j]=dp[i-1][j] | dp[i][j-1];
            }
            else{
                dp[i][j]=0;
            }
        }
    }
    return dp[n][m];
    }
    int wildCard(String pattern, String str)
    {
        // Your code goes here
        return isMatching(str,pattern);
    }
}
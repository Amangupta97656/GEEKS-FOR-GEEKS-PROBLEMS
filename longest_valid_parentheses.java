class Solution{
    static int maxLength(String S){
        // code here
        int mx = 0,op=0,cl=0,mx2=0;
        for(int i =0;i<S.length();i++){
            if(S.charAt(i)=='(')op++;
            else cl++;
            if(cl>op){
                op =0;
                cl =0;
            }
            else if(op==cl) mx=Math.max(mx,op*2);
        }
        op=0;
        cl =0;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)=='(') op++;
            else cl++;
            if(op>cl){
                op=0;
                cl=0;
            }
            else if(op==cl) mx2 = Math.max(mx2,op*2);
        }
        return Math.max(mx,mx2);
    }
}
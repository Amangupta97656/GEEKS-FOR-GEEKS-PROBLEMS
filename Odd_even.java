class Solution {
    public static String oddEven(String s) {
        // code here
        int []alpha=new int[26];
        for(int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(alpha[i]==0) continue;
            if((i+1)%2==0 && alpha[i]%2==0){
                count++;
            }
            if((i+1)%2!=0 && alpha[i]%2!=0) count++;
        }
        return count%2==0?"EVEN":"ODD";
    }
}
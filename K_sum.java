class Solution {
    public String clearDigits(String s) {
        String ans="";
        String num="0123456789";
        for(int i=0;i<s.length();i++)
        {
            if(num.contains((s.charAt(i)+"")))
            {ans=ans.substring(0,ans.length()-1);}
            else{ans+=s.charAt(i);}
        }
        return ans;
    }
}
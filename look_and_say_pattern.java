class Solution {
    public String countAndSay(int n) {
        // code here
        int num=1;
        String str=String.valueOf(num);
        StringBuilder ss=new StringBuilder(str);
        StringBuilder temp=new StringBuilder();
        for(int i=1;i<n;i++){
            int len=ss.length();
            int j=0;
            temp=new StringBuilder();
            while(j<len){
                char digit=ss.charAt(j);
                int cnt=1;
                j++;
                while(j<len&&ss.charAt(j)==digit){
                    cnt++;
                    j++;
                }
                temp.append(""+cnt);
                temp.append(digit);
            }
            ss=new StringBuilder(temp);
        }
        return new String(ss);
        
    }
}
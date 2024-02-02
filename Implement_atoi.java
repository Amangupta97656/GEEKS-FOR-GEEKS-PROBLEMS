
class Solution
{   
      int atoi(String s) {
            boolean minus = s.charAt(0) == '-' ? true : false;
            int start = s.charAt(0) == '-' ? 1 : 0;
            int result = 0;
            for(int i = start ; i<s.length() ; i++) {
                 if(s.charAt(i) + '0' > 115 || s.charAt(s.length()-1) == '-') return -1;
                         int val = ('0' - ('a' - s.charAt(i))) + 1;
                         result = result * 10 + val;
             }
        return minus == true ? (-1 * result ) : result ;
    }
}
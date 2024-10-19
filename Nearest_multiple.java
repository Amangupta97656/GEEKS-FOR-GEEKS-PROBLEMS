class Solution {

    String roundToNearest(String str) {
        // Complete the function
        StringBuilder sb = new StringBuilder("");
        int carry = 0;
        if(str.length() == 1)
        {
            int a = str.charAt(0) - '0';
            if(a < 6)
            {
                sb.append("0");
            }
            else
            {
                sb.append("10");
            }
            
            return sb.toString();
        }
        
        for(int i = str.length()-1; i >= 0; i--)
        {
            int a = str.charAt(i)-'0';
            a += carry;
            if(i == str.length()-1)
            {
                if(a > 5)
                carry = 1;
                
                sb.insert(0,"0");
            }
            else if(i == 0)
            {
                sb.insert(0,a+"");
            }
            else
            {
                if(a < 10)
                {
                    carry = 0;
                    sb.insert(0,a+"");
                }
                else
                {
                    carry = 1;
                    a %= 10;
                    sb.insert(0,a+"");
                }
            }
        }
        
        return sb.toString();
    }
}
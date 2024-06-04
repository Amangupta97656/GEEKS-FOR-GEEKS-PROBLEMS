class Solution {
    String binaryNextNumber(String s) {
       int carry = 1;
       StringBuilder sb = new StringBuilder();
       int i = s.length() - 1 ;
       while(i >= 0){
           int num = carry + s.charAt(i) - '0';
           
           if(num ==  1){
               sb.append("1");
               carry = 0;
           }
           else if(num == 0){
               sb.append("0"); 
               carry = 0;
           }
           else{
               sb.append("0"); 
               carry = 1;
           }
           i--;
       }
       if(carry == 1)
         sb.append("1");
         
        int j = 0;
        
        sb = sb.reverse();
        
        while(sb.charAt(j) != '1')
            j++;
         return sb.substring(j).toString();
    }
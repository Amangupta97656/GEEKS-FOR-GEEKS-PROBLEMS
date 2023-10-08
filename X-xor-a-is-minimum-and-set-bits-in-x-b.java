class Solution {
    public static int minVal(int a, int b) {
        // code here
           int bitsA = Integer.bitCount(a);
       int bitsB = Integer.bitCount(b);
       
       if(bitsA==bitsB){
           return a;
       }
       
       if(bitsA>bitsB){
     
           while(bitsA>bitsB){
               a = a & (a-1);
               bitsA--;
           }
       } else {
         
          
           while(bitsA<bitsB){
               a = a | (a+1);
               bitsA++;
           }
       }
       return a;
    }
}
class Solution{
    int modulo(String s, int m) {
        //Write your code here
         int a =0; 
         for(int i =0; i<s.length();i++){ 
             int b = s.charAt(i) -'0'; 
             a = (a *2 +b)%m ;
         }
         return a;
    }
}
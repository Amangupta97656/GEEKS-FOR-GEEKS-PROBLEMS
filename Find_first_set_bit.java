class Solution
{

    public static int getFirstSetBit(int n){
            
         String binary=Integer.toBinaryString(n);
         for(int i=binary.length()-1;i>=0;i--){
             if(binary.charAt(i) == '1'){
                 return binary.length()-i;
             }
         }
         return 0;
            
    }
}
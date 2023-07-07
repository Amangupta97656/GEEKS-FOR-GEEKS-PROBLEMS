class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
       long pow=1;
        while(pow<=n){
            if(pow==n){
                return true;
            }
            pow*=2;
        }
        return false;
    }
    
}
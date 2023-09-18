class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n==0) return false;
        if(n==1) return true;
        while(n>1){
            if(n%2!=0) return false;
            n/=2;
        }
        return true;
    }
    
}
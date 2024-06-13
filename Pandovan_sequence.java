class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
        
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        
        int a = 1, b = 1, c = 1;
        int d = 0;
        int mod = 1000000007;
        
        for(int i=3; i<=n; i++){
            d= (a+b) % mod;
            a= b;
            b= c;
            c= d;
            
        }
        return d; 
        
    }
   
    
}
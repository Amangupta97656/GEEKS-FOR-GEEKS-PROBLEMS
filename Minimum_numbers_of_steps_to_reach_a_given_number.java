class Solution {
    static int minSteps(int d) {
        
        int n=(int)(Math.sqrt(2.0*d + 0.25) - 1.5 );
        int sum = n*(n+1)/2;
        
        for(int i=n+1;  i<=d+1; i++)
        {
            sum += i;
            
            if(sum >= d)
            {
                int diff = sum-d;
                if(diff % 2 == 1) continue;
                
                return i;
            }
        }
        
        return 0;
    }
}
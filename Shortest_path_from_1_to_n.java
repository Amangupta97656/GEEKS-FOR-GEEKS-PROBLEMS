class Solution{
    public int minStep(int n)
    {
            int c = 0;
            while(n!=1){
                if(n%3==0){
            
                    n=n/3;
                }
                    else
                    {
                     n--;   
                    }
                    c++;
                }
                return c;
            }
    }
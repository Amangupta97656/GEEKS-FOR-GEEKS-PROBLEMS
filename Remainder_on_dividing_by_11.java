class Solution 
{ 
     static int xmod11(String x)
    {    
        // code here
        
        
        if(x.length()<=1)
        {
            return (x.charAt(0)-'0')%11;
        }
        int num1  =  x.charAt(0)-'0';
        int num2 = x.charAt(1)-'0';
        int ans  = ((num1 * 10) + num2) % 11;

        for(int i=2; i<x.length(); i++)
        {
            ans =  ((ans * 10) + (x.charAt(i)-'0')) %11;
             
        }

return ans;
    }
} 
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
         if(n==1)return arr[0];
        long max =Integer.MIN_VALUE;
        int c=0;
    
        long p1=1,p2=1;
        
       
        for(int x:arr)
        {
            if(p1==0) p1++;
    
            if(p2==0) p2++;
            if(x>0)
            {
                p1*=x;
                p2*=x;
            }
            else if(x<0 )
            {
                if(c>=1)
                {
                  p1*=x;
                  p2*=x;
                  c++;
                }
                else
                {
                c++;
                
                p1*=x;
                p2=0;
                }
            }
            else
            {
                p1=0;
                p2=0;
                c=0;
            }
            // System.out.println(p1+" "+p2);
             max=Math.max(Math.max(p1,p2),max);
        }
       
       return max;
        
    }
}
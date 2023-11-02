class Solution {
    static int  abs(int x, int y) {
        if(x>y)
           return x-y;
        return y-x; 
    }
    int minDist(int a[], int n, int x, int y) {
        // code here
        int min=Integer.MAX_VALUE, ix=-1, iy=-1; 
        for(int i=0; i<n; i++) {
            if(a[i]==x)
               ix=i; 
            if(a[i]==y)
             iy=i;
             if(ix!=-1&&iy!=-1)
              min = Math.min(min,abs(ix,iy));
              
        }
        if(min!=Integer.MAX_VALUE)
            return min; 
        
        return -1;
        
    }
}
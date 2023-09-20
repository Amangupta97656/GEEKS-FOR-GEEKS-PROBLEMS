
class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        ArrayList<Integer> list =  new ArrayList<>();
        
        int m = D%16;
        int l = (N<<m|N>>(16-m))&65535;// making leftmost 16  bit 0 by and with 2 power 16 because int is 32 bit and we want only  rightmost 16 bit 
        int r = (N>>m|N<<(16-m))&65535;
        
        list.add(l);
        list.add(r);
        return list;
    }
}
class Solution{
    static int setSetBit(int x, int y, int l, int r){
        
        for(int i=l; i<=r; i++){
            
            int mask = 1 << (i-1);
            if((y & mask) != 0){
                x |= mask;
            }
        }
        return x;
    }
}
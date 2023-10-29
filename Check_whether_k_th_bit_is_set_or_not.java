class CheckBit
{
    static boolean checkKthBit(int n, int k)
    {
        int left = 1<<k;
        if((n & left) == 0){
            return false;
        }
        return true;
        
    }
    
}
class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        int res = m^n;
        String bin = Integer.toBinaryString(res);
        
        int l = bin.length();
        int count = 1;
        int result = -1;
        for(int i=l-1;i>=0;i--){
           
            if(bin.charAt(i)== '1'){
                result = count;
                break;
            }
            count++;
        }
        return result;
            
    }


}

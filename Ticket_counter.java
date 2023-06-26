class Solution {
    public static int distributeTicket(int N,int K)
    {
        
        int ans =0;
        int i=0, j= N-1;
        while(i<=j){
            int size = K;
            while(size>0 && i<=j){
                ans = i;
                // System.out.println("ans i"+ans);
                i++;
                size--;
            }
            
            size = K;
            while(size>0 && i<=j){
                ans = j;
                // System.out.println("ans j"+ans);
                j--;
                size--;
            }
        }
        return ans+1;
    }
}
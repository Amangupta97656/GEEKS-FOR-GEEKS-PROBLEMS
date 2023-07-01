class Solution {
    static int setBits(int N) {
        // code here
        int count =0;
        while(N>0){
            int r=N%2;
            if(r==1)
                count++;
            N/=2;
        }
        return count;
    }
}
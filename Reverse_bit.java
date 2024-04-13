class Solution {
    static Long reversedBits(Long x) {
        // code here
        long ans=0;
        for(int i=0;i<32;i++){
            int k=0;
            if(((1<<i)&x)!=0)k++;
            ans+=((1L<<31-i)*k);
        }
        return ans;
    }
};
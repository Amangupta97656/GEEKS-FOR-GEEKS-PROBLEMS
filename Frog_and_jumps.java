class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        boolean dp[] = new boolean[leaves];
        for(int i=0;i<N;i++){
            int a = frogs[i];
            if(a<=leaves && !dp[a-1]){
               while(a<=leaves){
                dp[a-1]=true;
                a+=frogs[i];
            }  
            }
           
           
        }
        int ans =0;
        for(int i=0;i<dp.length;i++){
          if(!dp[i]){
              ans++;
          }  
        }
        return ans;
    }
}
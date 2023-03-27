class Solution {
 
    static int find(int n,int k,int pos,int min,int sum,int[][][] dp){
        
    
        if(pos==k-1){
        
            if((n-sum)>=min){
              
                dp[pos][n-sum][n]=1;
                return 1;
                
            }else{
       
                return 0;
            }
        }
  
    
        int t=0;
        for(int i=min;(i+sum)<=n;i++){
            
             int y=0;
             if(dp[pos][i][sum+i]==-1){
                 
                 y=find(n,k,pos+1,i,sum+i,dp);
                 dp[pos][i][sum+i]=y;
                 
             }else{
                 
                 y=dp[pos][i][sum+i];
             }
                t+=y;
        }
       
        return t;
        
    }
    public int countWaystoDivide(int N, int K) {
        
       int[][][] dp=new int[K][N+1][N+1];
      
       for(int i=0;i<K;i++){
           for(int j=0;j<N+1;j++){
               for(int u=0;u<N+1;u++){
                   
               dp[i][j][u]=-1;
               
               }
           }
       }
            return find(N,K,0,1,0,dp);
     
        
    }
}
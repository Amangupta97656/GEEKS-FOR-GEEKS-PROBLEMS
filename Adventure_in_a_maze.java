class Solution
{


    
    static int MOD = 1000000007;
    
    public int[] FindWays(int[][] matrix)
    {
        int n = matrix.length;
        
        int max_dp[][] = new int[n][n];
        int count_dp[][] = new int[n][n];
        
        
        for(int i=n-1; i>=0; i--)
        {
            for(int j=n-1; j>=0; j--)
            {
                if(i==n-1 && j==n-1)
                {
                    count_dp[i][j] = 1;
                    max_dp[i][j] = matrix[i][j];
                }
                else
                {
                    int val = matrix[i][j];
                    
                    
                    if(val==1)
                    {
                        if(j+1<n && max_dp[i][j+1]!=0)
                        {
                            count_dp[i][j] = count_dp[i][j+1];
                            max_dp[i][j] += val + max_dp[i][j+1];
                            
                        }
                        
                    }
                    
                    else if(val==2)
                    {
                        if(i+1<n && max_dp[i+1][j]!=0)
                        {
                            count_dp[i][j] = count_dp[i+1][j];
                            max_dp[i][j] += val+max_dp[i+1][j];
                            
                        }
                        
                    }
                    
                    else
                    {
                        if(j+1<n && max_dp[i][j+1]!=0)
                        {
                            count_dp[i][j] += count_dp[i][j+1];
                            max_dp[i][j] += val+max_dp[i][j+1];
                            
                        }
                        
                        count_dp[i][j] = count_dp[i][j] % MOD;
                        max_dp[i][j] = max_dp[i][j] % MOD;
                        
                        if(i+1<n && max_dp[i+1][j]!=0)
                        {
                            count_dp[i][j] += count_dp[i+1][j];
                            max_dp[i][j] = Math.max(max_dp[i][j], val+max_dp[i+1][j]);
                            
                        }
                        
                    }
                    
                    
                    count_dp[i][j] = count_dp[i][j] % MOD;
                    max_dp[i][j] = max_dp[i][j] % MOD;
                    
                    
                }
                
            }
        }
        
        
        
        return new int[]{count_dp[0][0], max_dp[0][0]};
        
    }
}

class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {
        int dx[]={-1,-1,-1,0,0,1,1,1};
        int dy[]={-1,0,1,-1,1,-1,0,1};
        int n=grid.length;
        int m=grid[0].length;
        ArrayList<int []> A=new ArrayList<>();
        int sz=word.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(word.charAt(0)==grid[i][j])
                {
                    for(int k=0;k<8;k++)
                    {
                        int p=1;
                        int row=i+dx[k];
                        int col=j+dy[k];
                        while(row<n && row>=0 && col<m && col>=0 && p<sz && word.charAt(p)==grid[row][col] )
                        {
                            p++;
                            row+=dx[k];
                            col+=dy[k];
                        }
                        if(p==sz)
                        {
                            int []temp={i,j};
                            A.add(temp);
                            break;
                        }
                    }
                }
            }
        }
        int ans[][]=new int[A.size()][2];
        for(int i=0;i<A.size();i++)
            ans[i]=A.get(i);
        return ans;
    }
}
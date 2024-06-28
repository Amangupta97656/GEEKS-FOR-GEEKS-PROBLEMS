class Solution {
    public String pattern(int[][] arr) {
        // Code here
        String rc="_";
        int res=-1;
        // checking in the row
        for(int i=0; i<arr.length; i++)
        {
            int m=arr[i].length;
            int q=m-1;
            int p=0;
            int flag=0;
            // checking for palindrome
            while(p<=q)
            {
                if(arr[i][p]!=arr[i][q])
                {
                    flag++;
                    break;
                }
                p++;
                q--;
            }
            if(flag==0 && res==-1)
            {
                res=i;
                rc="R";
                break;
            }
        }
        // check for columns only if res==-1
        if(res==-1)
        {
            // Atfirst transposing the matrix
            for(int i=0;i<arr.length-1; i++)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    // swap arr[i][j] with arr[j][i
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            for(int i=0; i<arr.length; i++)
            {
                int m=arr[i].length;
                int q=m-1;
                int p=0;
                int flag=0;
                // checking for palindrome
                while(p<=q)
                {
                    if(arr[i][p]!=arr[i][q])
                    {
                        flag++;
                        break;
                    }
                    p++;
                    q--;
                }
                if(flag==0 && res==-1)
                {
                    res=i;
                    rc="C";
                    break;
                }
            }
        }
        String r="";
        if(res==-1)
        {
            r="-1";
        }else{
            r=r+res+" "+rc;
        }
        return r;
        
    }
}
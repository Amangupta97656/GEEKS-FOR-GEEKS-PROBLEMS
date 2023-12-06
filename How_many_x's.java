class Solution {
    
    int reminder(int num , int target)
    {
        int cnt = 0;
        while(num != 0)
        {
            if(num % 10 == target)
            {
                cnt ++;
            }
            num /= 10;
        }
        return cnt;
    }
    
    
    int countX(int L, int R, int X) 
    {
        int cnt = 0;
        for(int i = L + 1 ; i < R ; i++)
        {
            cnt += reminder(i , X);
        }
        return cnt;
    }
};


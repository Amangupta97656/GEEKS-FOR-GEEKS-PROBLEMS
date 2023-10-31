class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    { 
        // your code here
        int arr[] = new int[n+1];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i <= n ; i++){
            arr[i] = (arr[i-1]%1000000007+arr[i-2]%1000000007)%1000000007;
        }
        return arr[n-1]%1000000007;
    }
}
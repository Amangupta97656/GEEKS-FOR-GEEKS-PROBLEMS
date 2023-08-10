
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int arr[][] = new int[x+1][y+1];
        for(int i=x; i>=0;i--){
            for(int j=y; j>=0; j--){
                if(i==x|| j==y){
                    arr[i][j]=0;
                }
                else if(s1.charAt(i)==s2.charAt(j)){
                    arr[i][j]= 1 + arr[i+1][j+1];
                }
                else if(s1.charAt(i)!=s2.charAt(j)){
                    arr[i][j] = Math.max(arr[i][j+1],arr[i+1][j]);
                }
            }
        }
        return arr[0][0];
    }
    
}
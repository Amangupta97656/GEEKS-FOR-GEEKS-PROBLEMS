class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        // Your code here
        int ans[] = new int[2];
        int j = 0;
        for(int i = 0; i < n+2 ; i++){
            int val = Math.abs(arr[i]);
            if(arr[val] < 0){
                ans[j++] = val;
            }else{
                arr[val] = -arr[val];
            }
        }
        return ans;
    }
    
}
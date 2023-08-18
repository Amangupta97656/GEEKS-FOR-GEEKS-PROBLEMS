class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int min=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=min)
            {
                min=arr[i];
                ans.add(min);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
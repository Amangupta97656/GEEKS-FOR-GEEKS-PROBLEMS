
class Solution
{
   public static int[] calculateSpan(int arr[], int n)
    {
        Stack<Integer> st = new Stack<>();
        int ans []= new int[n];
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && arr[i] >= arr[st.peek()])
                st.pop();
            if(st.isEmpty())
                ans[i] = i+1;
            else
                ans[i] = i - st.peek() ;
            st.push(i);
        }
        return ans;
    }
    
}
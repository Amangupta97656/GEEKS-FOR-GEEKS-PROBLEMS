class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int[] left= new int[arr.length];
        int[] right = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<arr.length; i++){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                left[i] = st.peek();
            }
            else{
                left[i] = 0;
            }
            st.push(arr[i]);
        }
        
        st.clear();
        for(int i = arr.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                right[i] = st.peek();
            }
            else{
                right[i] = 0;
            }
            st.push(arr[i]);
        }
        
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            ans = Math.max((Math.abs(left[i] - right[i])), ans);
        }
        return ans;
    }
}
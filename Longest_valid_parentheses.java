class Solution{
    static int maxLength(String S){
        // code here
        int max=0;
        Stack<Integer> stk=new Stack<>();
        stk.push(-1);
        for(int i=0; i<S.length(); i++){
            char c=S.charAt(i);
            if(c=='('){
                stk.push(i);
            }
            else{
                stk.pop();
                if(stk.isEmpty()){
                    stk.push(i);
                }
                else{
                    int len=i-stk.peek();
                    max=Math.max(max,len);
                }
            }
        }
        return max;
    }
}
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(ch==')'&&stack.peek()=='('){
                    stack.pop();
                }else if(ch=='}'&&stack.peek()=='{'){
                    stack.pop();
                }else if(ch==']'&&stack.peek()=='['){
                    stack.pop();
                }else{
                    return false;
                }
            }
            // System.out.println("stack="+stack);
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}


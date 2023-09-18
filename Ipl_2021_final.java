static int findMaxLen(String S) {
        // code here
        int max=0;
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                s.push(i);
            }
            else{
                s.pop();
            }
            if(s.size()==0){
                s.push(i);
            }
            else{
                max=Math.max(max,i-s.peek());
            }
        }
        return max;
    }
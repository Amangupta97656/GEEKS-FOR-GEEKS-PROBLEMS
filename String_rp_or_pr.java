class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	   int i=0;
        long ans =0;
        int N = S.length();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        Stack<Character> temp = new Stack<>();
        if(X> Y){
            while(i< N){
                while(i < N && !stack.isEmpty() && stack.peek() == 'p' && S.charAt(i) == 'r') {
                    stack.pop(); 
                    sb.deleteCharAt(sb.length()-1);
                    ans += X;
                    i++;
                }
                if(i< N){
                    stack.push(S.charAt(i));
                    sb.append(S.charAt(i));
                } 
                i++;
            }
           // System.out.println(stack  + " "+ ans+ " "+ sb);
           // while(stack.size() > 1 ){
           //     char c1 = stack.pop();
           //     if(c1 == 'p' && stack.peek() == 'r') ans += Y;
           // }
           i = 0;
           N = sb.length();
            while(i< N){
               if(temp.isEmpty()){
                   temp.push(sb.charAt(i));
                   i++;
               }else{
                   while(!temp.isEmpty() && i< N &&  sb.charAt(i) == 'p' && temp.peek() =='r'){
                       ans += Y;
                       temp.pop();
                       i++;
                   }
                   if(i< N){
                       temp.push(sb.charAt(i));
                       i++;
                   }
               }
           }
            
        }else{
            while(i< N){
                while(i< N && !stack.isEmpty() && stack.peek() == 'r' && S.charAt(i) == 'p') {
                    stack.pop(); 
                    sb.deleteCharAt(sb.length()-1);
                    ans += Y;
                    i++;
                }
                if(i< N){
                    stack.push(S.charAt(i));
                    sb.append(S.charAt(i));
                } 
                i++;
            }
            N = sb.length();
           // System.out.println(stack + " " + ans + " "+ sb);
            i=0;
           // System.out.println(stack + " "+ ans);
           // while(stack.size() > 1 ){
           //     char c1 = stack.pop();
           //     if(c1 == 'r' && stack.peek() == 'p') ans += X;
           // }
           while(i< N){
               if(temp.isEmpty()){
                   temp.push(sb.charAt(i));
                   i++;
               }else{
                   while(!temp.isEmpty() && i< N && sb.charAt(i) == 'r' && temp.peek() =='p'){
                       ans += X;
                       temp.pop();
                       i++;
                       //System.out.println("ans is "+ ans + " "+ temp);
                   }
                   if(i< N){
                       temp.push(sb.charAt(i));
                       i++;
                   }
               }
           }
          
        }
        return ans;
        
    }
} 
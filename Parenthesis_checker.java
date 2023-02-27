class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        if(x.length()%2 != 0) {

            return false;

        }

        

        Stack<Character> stack = new Stack<>();

        

        for(int i=0; i<x.length(); i++) {

            

            char ch = x.charAt(i);

            boolean found = false;

            if(ch == ')') {

                if(!stack.isEmpty() && stack.peek() == '(') {

                    stack.pop();

                    found = true;

                }

            }

            else if(ch == '}') { 

                if(!stack.isEmpty() && stack.peek() == '{') {

                    stack.pop();

                    found = true;

                }

            }

            else if(ch == ']') {

                if(!stack.isEmpty() && stack.peek() == '[') {

                    stack.pop();

                    found = true;

                }

            }

            if(!found)

                stack.push(ch);

        }

        

        if(stack.size() == 0) {

            return true;

        }

        

        return false;

    }
    }
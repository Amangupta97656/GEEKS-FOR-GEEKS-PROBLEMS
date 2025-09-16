
class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (ans.isEmpty()) {
                ans.add(nums[i]);
            } else {
                int last = ans.get(ans.size() - 1);
                int curr = nums[i];
                
                while (!isCoPrime(last, curr)) {
                    curr = findLcm(last, curr);
                    ans.remove(ans.size() - 1);
                    if (ans.isEmpty()) break;
                    last = ans.get(ans.size() - 1);
                }
                ans.add(curr);
            }
        }
        
        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;public class Solution {

    // Perform floor division as per problem statement
    private static int floorDiv(int a, int b) {
        if ((a < 0) ^ (b < 0)) { // If signs differ
            return (a / b) - (a % b == 0 ? 0 : 1);
        } else {
            return a / b;
        }
    }

    public int evaluatePostfix(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String token : arr) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int res = applyOperator(a, b, token);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") 
                || token.equals("/") || token.equals("^");
    }

    private int applyOperator(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> floorDiv(a, b);
            case "^" -> (int) Math.pow(a, b);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    // Optional main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] example1 = {"2", "3", "1", "*", "+", "9", "-"};
        String[] example2 = {"2", "3", "^", "1", "+"};

        System.out.println(sol.evaluatePostfix(example1)); // Output: -4
        System.out.println(sol.evaluatePostfix(example2)); // Output: 9
    }
}
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int findLcm(int a, int b) {
        return (a / gcd(a, b)) * b; 
    }

    private boolean isCoPrime(int a, int b) {
        return gcd(a, b) == 1;
    }
}
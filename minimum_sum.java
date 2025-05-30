class Solution {
    String minSum(int[] arr) {
        Arrays.sort(arr);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        boolean first = true;
        for(int i:arr){
            if(i==0) continue;
            if(first){
                num1.append(i+"");
            }
            else num2.append(i+"");
            first = !first;
        }
        return solve(num1,num2);
    }
    static String solve(StringBuilder num1,StringBuilder num2){
        StringBuilder ans = new StringBuilder();
        int carry = 0,n1 = num1.length()-1,n2 = num2.length()-1;
        while(n1>=0 && n2>=0){
            int e = (num1.charAt(n1)-'0')+(num2.charAt(n2)-'0')+carry;
            ans.append((e%10)+"");
            carry = e/10;
            n1--;
            n2--;
        }
        while(n1>=0){
            int e = (num1.charAt(n1)-'0')+carry;
            ans.append((e%10)+"");
            carry = e/10;
            n1--;
        }
        while(n2>=0){
            int e = (num2.charAt(n2)-'0')+carry;
            ans.append((e%10)+"");
            carry = e/10;
            n2--;
        }
        if(carry>=1) ans.append(1+"");
        return ans.reverse().toString();
    }
}
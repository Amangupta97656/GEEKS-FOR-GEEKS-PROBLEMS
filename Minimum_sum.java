class Solution {
    public static String getSum(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        int i = num1.size()-1;
        int j = num2.size()-1;
        StringBuilder ans = new StringBuilder();

        int sum, carry = 0;
        while((i >= 0) && (j >= 0)) {
            sum = num1.get(i--) + num2.get(j--) + carry;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }
            ans.append(sum);
        }

        if(i == 0) {
            sum = num1.get(0) + carry;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }
            ans.append(sum);
        }

        if(j == 0) {
            sum = num2.get(0) + carry;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }
            ans.append(sum);
        }

        if(carry > 0) ans.append(carry);

        ans.reverse();
        return ans.toString();
    }
    
    public String minSum(int[] a) {
        int freq[] = new int[10];
        for(int digit : a) freq[digit]++;

        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        boolean flag = true;

        for(int i=1; i<10; i++) {
            while(freq[i]-- > 0) {
                if(flag) num1.add(i);
                else num2.add(i);
                flag = !flag;
            }
        }

        return getSum(num1, num2);        
    }
}
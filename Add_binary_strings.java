class Solution {
    public String addBinary(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();

        int i = n - 1, j = m - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int a = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int b = (j >= 0) ? s2.charAt(j--) - '0' : 0;
            int sum = a + b + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }

        // Reverse the result and convert to String
        String output = result.reverse().toString();

        // Remove leading zeros
        return output.replaceFirst("^0+(?!$)", ""); // Removes leading zeros, except if result is "0"
    }
}


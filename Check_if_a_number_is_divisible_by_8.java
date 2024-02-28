class Solution {
    int DivisibleByEight(String s) {
        int n = s.length();
        // If the number is less than 3 digits, convert it to integer and check
        if (n <= 3) {
            int num = Integer.parseInt(s);
            if (num % 8 == 0)
                return 1;
            else
                return -1;
        }

        // Check if the last three digits form a number divisible by 8
        int num = Integer.parseInt(s.substring(n - 3));
        if (num % 8 == 0)
            return 1;
        else
            return -1;
    }
}

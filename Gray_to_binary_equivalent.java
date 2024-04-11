class Solution{
    public static int grayToBinary(int n) {
        String binaryNum = Integer.toBinaryString(n);
        String grayNum = "";
        char ch = binaryNum.charAt(0);
        grayNum +=  ch;
        int prev = ch - '0';
        for (int i = 1; i < binaryNum.length(); i++) {
            int curr = binaryNum.charAt(i) - '0';
            prev = prev ^ curr;
            grayNum += prev;
        }
        return Integer.parseInt(grayNum, 2);
    }
       
}
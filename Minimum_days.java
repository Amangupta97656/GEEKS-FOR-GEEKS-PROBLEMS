class Solution {
    public static int getMinimumDays(int N, String S, int[] P) {
            StringBuilder sb = new StringBuilder(S);

        int ind= 0, count=0;

        for(int i=0; i< N-1; i++){

            while(sb.charAt(i) == sb.charAt(i+1) && sb.charAt(i) != '?' ){

                sb.setCharAt(P[ind], '?');

                count++;

                ind++;

                // System.out.println("string is "+sb);

            }

        }

        return count;

    }

}
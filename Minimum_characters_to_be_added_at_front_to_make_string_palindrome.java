 

class Solution {
    public static int minChar(String str) {
       //Write your code here
       
        int ans = 0;

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                ans=str.length()-j;
                   i  = 0;

                while(str.charAt(i)==str.charAt(j)){
                    i++;
                    ans--;
                }
                j--;

            }
        }


        return ans;


       
       
    }
}
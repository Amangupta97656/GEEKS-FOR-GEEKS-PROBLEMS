class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()) return false;
        int alpha[] = new int[26];
        for(int i = 0; i<s1.length(); i++){
            alpha[s1.charAt(i)-(int)'a']++;
        }
        for(int i = 0; i<s2.length(); i++){
            alpha[s2.charAt(i)-(int)'a']--;
        }
        for(int i = 0; i<alpha.length; i++){
            if(alpha[i]!=0) return false;
        }
        return true;
    }
}
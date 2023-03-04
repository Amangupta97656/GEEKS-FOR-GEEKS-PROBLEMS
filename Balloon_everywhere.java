class Solution {
    public int maxInstance(String s) {
        int[] numOfCharacters = new int[26];
        for(int i = 0; i < s.length(); ++i)
            numOfCharacters[s.charAt(i) - 'a']++;
        numOfCharacters['l' - 'a'] /= 2;
        numOfCharacters['o' - 'a'] /= 2;
        String ballon = "ballon";
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< ballon.length(); ++i )
            min = Math.min(min, numOfCharacters[ballon.charAt(i) - 'a']);  
        return min;
    }
}
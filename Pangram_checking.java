class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        s = s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            set.add(ch);
        }
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!(ch >= 'a' && ch <= 'z'))continue;
            if(set.contains(ch)){
                set.remove(ch);
            }
        }
        if(set.size() == 0)return true;
        else return false;
    }
}
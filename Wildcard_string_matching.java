class Solution{
    static boolean match(String wild, String pattern)
    {
         String w = "";
        for(int i =0 ; i< wild.length(); i++)
        {
            if(wild.charAt(i) == '?')
            w+= "[a-z]";
            else if(wild.charAt(i) == '*')
            w+= "([a-z]*)*";
            else 
            w+= wild.charAt(i);
        }
        return java.util.regex.Pattern.matches(w , pattern);
    }
}
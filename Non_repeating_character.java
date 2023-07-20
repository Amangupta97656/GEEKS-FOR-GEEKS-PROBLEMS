class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
        for(int i=0;i<S.length();i++)
        {
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        }
        int i=0;
        for(Character x:map.keySet())
        {
            if(map.get(x)==1)
                return x;
        }
        return '$';
    }
}
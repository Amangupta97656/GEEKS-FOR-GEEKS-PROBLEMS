class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        String clockWise = str1.substring(str1.length()-2) + str1.substring(0,str1.length()-2);
        // System.out.println(clockWise);
        String antiClock = str1.substring(2)+str1.substring(0,2);
        // System.out.println(antiClock);
        
        if(str2.equals(clockWise) || str2.equals(antiClock)){
            return true;
        }
        return false;
    }
    
}
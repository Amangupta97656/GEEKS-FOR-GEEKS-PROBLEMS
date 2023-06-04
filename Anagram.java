class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
  boolean flag = false;
        int l1 = a.length();
        int l2 = b.length();
        if(l1!=l2){
            return false;
        }
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        a = new String(c1);
        b = new String(c2);
        for(int i = 0;i<l1;i++){
            if(a.charAt(i)==b.charAt(i)){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag==true){
            return true;
        }
        return false;
    }
}
class Solution{
    static Map<String,Boolean> mp = new HashMap<>();
    static boolean isScramble(String s1,String s2)
    {
        //code here
        int n=s1.length();
        boolean flag = false,swap,noswap;
        
        if(s1.equals(s2)) return true;
        if(s1.length()<=1) return false;
        
        String key=s1+"_"+s2;
        if(mp.containsKey(key)) return mp.get(key);
        
        for(int i=1;i<n;i++){
            noswap=(isScramble(s1.substring(0,i),s2.substring(0,i)) &&
                isScramble(s1.substring(i,n),s2.substring(i,n)));
                
            swap=(isScramble(s1.substring(0,i),s2.substring(n-i,n)) &&
                isScramble(s1.substring(i,n),s2.substring(0,n-i)));
                
                if(swap||noswap){
                    flag=true;
                    break;
                }
        }
        mp.put(key,flag);
        return flag;
    }
}

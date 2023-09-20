class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here
        
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>>result=new ArrayList<>();
        
        findPalin(S,list,result,0);
        return result;
        
    }
    static void findPalin(String s , ArrayList<String>list , ArrayList<ArrayList<String>>result,int Index)
    
    {
        if(Index==s.length())
        {
            result.add(new ArrayList<>(list));
            
            return ;
        }
        String temp="";
        
        for(int i=Index;i<s.length();i++)
        {
            temp+=s.charAt(i);
            
            if(isPalin(temp))
            {
                list.add(temp);
                
                findPalin(s,list,result,i+1);
                
                list.remove(list.size()-1);
                
            }
         
        }
        
    }
    
    static boolean isPalin(String str)
    {
        if(str.length()<2)
        return true;
        
        
        
        int start=0;
        int end=str.length()-1;
        
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            return false;
            
            start++;
            end--;
        }
        return true;
    
    }
};


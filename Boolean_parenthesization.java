class Solution{
    static int countWays(int N, String S)
    {
        Map<String,Integer> dp=new HashMap<>();
        
        return BooleanParenthesis(S,0,S.length()-1,true,dp)%1003;
    }
    public static int BooleanParenthesis(String s,int i,int j,boolean toFind,Map<String,Integer> dp)
    {
        
        String key=i+"-"+j+"-"+toFind;
        
        if(dp.containsKey(key))
        {
            return dp.get(key);
        }
        
        if(i==j)
        {
            if(toFind==true)
            return s.charAt(i)=='T'?1:0;
            else
            return s.charAt(i)=='F'?1:0;
        }
        
        int count=0;
        
        for(int k=i+1;k<=j-1;k+=2)
        {
            char operator=s.charAt(k);
        int leftTrue=BooleanParenthesis(s,i,k-1,true,dp)%1003;
        int leftFalse=BooleanParenthesis(s,i,k-1,false,dp)%1003;
        int rightTrue=BooleanParenthesis(s,k+1,j,true,dp)%1003;
        int rightFalse=BooleanParenthesis(s,k+1,j,false,dp)%1003;
            count+=Evaluate(operator,leftTrue,leftFalse,rightTrue,rightFalse,toFind)%1003;
        }
        dp.put(key,count);
        return count%1003;
    }
    
    public static int Evaluate(char op,int leftTrue,int leftFalse,int rightTrue,int rightFalse,boolean toFind)
    {
        int ans=0;
        if(op=='^')
        {
            if(toFind==true)
         ans=(leftFalse*rightTrue)+(leftTrue*rightFalse);
         else
         ans=(leftTrue*rightTrue)+(leftFalse*rightFalse);
        }
        else if(op=='&')
        {
            if(toFind==true)
            ans=(leftTrue*rightTrue);
            else
            ans=(leftTrue*rightFalse)+(leftFalse*rightTrue)+(leftFalse*rightFalse);
        }
        else
        {
            if(toFind==true)
            ans=(leftFalse*rightTrue)+(leftTrue*rightFalse)+(leftTrue*rightTrue);
            else
            ans=(leftFalse*rightFalse);
        }
        return ans%1003;
    }
    
    
    
}
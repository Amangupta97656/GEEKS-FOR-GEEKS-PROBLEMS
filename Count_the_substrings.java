class Solution 
{ 
    int countSubstring(String S) 
    { 
          HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int l=0;
        int u=0;
        int ans=0;
        map.put(0,1);
        for(int i=0;i<S.length();i++){
            if(Character.isUpperCase(S.charAt(i)))u+=1;
            else l+=1;
            int val=u-l;
            if(map.containsKey(val)){
                ans+=map.get(val);
                map.put(val,map.get(val)+1);
            }else map.put(val,1);
            //System.out.println(val);
        }
        return ans;
    }
} 

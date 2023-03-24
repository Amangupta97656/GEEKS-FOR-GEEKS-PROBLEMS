class Solution 
{ 
    String removeReverse(String S) 
    { 
    HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=S.length()-1;
        boolean checking=false;
        HashSet<Integer> addIndex=new HashSet<>();
        for(char ch :S.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(i<j){
            char first=S.charAt(i);
            char last=S.charAt(j);
            if(!checking){
                if(map.get(first)>1){
                    map.put(first,map.get(first)-1);
                    addIndex.add(i);
                    checking=!checking;
                }
                i++;
            } else {
                 if(map.get(last) > 1){
                    map.put(last, map.get(last)-1);
                    addIndex.add(j);
                    checking = !checking;
                }
                j--;
                
            }
        }
        StringBuilder ans=new StringBuilder("");
        for(i=0;i<S.length();i++){
            if(!addIndex.contains(i)){
                ans.append(S.charAt(i));
            }
        }
        if(checking){
            return ans.reverse().toString();
        }
        return ans.toString();
    }
}
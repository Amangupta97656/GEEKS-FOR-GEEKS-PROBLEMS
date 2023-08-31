class Solution 
{ 
    int palindromeSubStrs(String s) { 
        if(s.length() == 1)return 1;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); ++i){
            String temp = s.substring(i, i + 1);
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);
            
            //get odd length of palindromes
            int left1 = i - 1;
            int right1 = i + 1;
            while(left1 >= 0 && right1 < s.length()){
                if(s.charAt(left1) == s.charAt(right1)){
                    String temp1 = s.substring(left1, right1 + 1);
                    hm.put(temp1, hm.getOrDefault(temp1, 0) + 1);
                    left1--;
                    right1++;
                }else{
                    break;
                }
            }
            
            //get even length of palindromes
            int left2 = i;
            int right2 = i+1;
            
            while(left2 >= 0 && right2 < s.length()){
                if(s.charAt(left2) == s.charAt(right2)){
                    String temp2 = s.substring(left2, right2 + 1);
                    hm.put(temp2, hm.getOrDefault(temp2, 0) + 1);
                    left2--;
                    right2++;
                }else{
                    break;
                }
            }
        }
        
        return hm.size();
    }
} 
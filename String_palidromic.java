class Solution {
    public boolean isPalinSent(String s) {
        // code here
     StringBuilder cleaned= new StringBuilder();
     for(char c : s.toCharArray()){
         
     if(Character.isLetterOrDigit(c)){
         cleaned.append(Character.toLowerCase(c));
     }
     }
     int left=0,right=cleaned.length()-1;
     while(left<right){
         if(cleaned.charAt(left)!=cleaned.charAt(right)){
         return false;
             
         }
         left++;
         right--;
     }
     return true;
    }
}
class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        
        if(bills[0]==10 || bills[0]==20)
        return false;
        
        int five_freq=0;
        int ten_freq=0;
        int tw_freq=0;
        
        for(int i=0;i<N;i++){
            if(bills[i]==5)
            five_freq++;
            
            else if(bills[i]==10){
                 
                 if(five_freq>=1){
            ten_freq++;
            five_freq--;
            }
            
            else
            return false;
            }
            
             else if(bills[i]==20) {
                 
                 if(ten_freq>=1 && five_freq>=1)
                 {
                     five_freq--;
                     ten_freq--;
                     tw_freq++;
                 }
                 
                 else if(five_freq>=3){
                 five_freq-=3;
                 tw_freq++;
                 }
                 
                 else
                 return false;
                 
             }
            
        }
        
        return true;
    }
}
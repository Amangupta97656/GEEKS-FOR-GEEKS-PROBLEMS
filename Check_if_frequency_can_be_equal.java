
class Solution {
    boolean sameFreq(String s) {
        // code here
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        // System.out.println(hm);
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> ele : hm.entrySet()){
            int val=ele.getValue();
            if(val>max){
                max=val;
            }
            if(val<min){
                min=val;
            }
        }
        // System.out.println(max);
        // System.out.println(min);
        
        if(max-min>1){ // for 'aaabbc' where a=3,b=2,c=1 more than one operation is required to make freq of all characters same 
            return false;
        }else if(max==min){ // for 'aaabbb' no operation is needed since freq is same for all
            return true;
        }
        else{
            int maxcount=0,onecount=0; 
           
            
            
            for(Map.Entry<Character,Integer> ele : hm.entrySet()){
                if(ele.getValue()==max){
                    maxcount++;
                }
                if(ele.getValue()==1){
                    onecount++;
                }
            }
        // System.out.println(count);
        // System.out.println(onecount);
            if(onecount==1){ 
                return true;
            }if(maxcount>1){
                return false;
            }else{
                return true;
            }
        }
        
    }
}
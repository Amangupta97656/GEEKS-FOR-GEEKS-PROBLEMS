class Solution
{
    public int minOperation(int n)
    {
        //code here.
   
           int count =0;
           while(n>0){
               if(n%2==0){
                   n=n/2;
                   count++;
               }else{
                   n=n-1;
                   count++;
               }
           }
           return count;
   
    }
}

class Solution {

    public boolean isValid(String s) {
        int count=0;
        String[] str0 = s.split("[.]", 0);
        if(str0.length!=4 || str0.length>4 || str0.length<4 || s.endsWith(".")==true){
            return false;
        }
        else{
            for(int i=0;i<str0.length;i++){
                if(str0[i].matches("^-?(\\d*\\.)?\\d+$")==true && str0[i].equals("")== false && (Integer.toString(Integer.parseInt(str0[i]))).length()==str0[i].length() && str0[i].length()<4 && (Integer.parseInt(str0[i])>=0 && Integer.parseInt(str0[i])<=255)){
                    count+=1;
                }
            }
            if(count==4){
                return true;
            }
        }
        return false;
    }
}
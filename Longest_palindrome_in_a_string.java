
class Solution{
    static String longestPalin(String S){
  int start=0, end=0, len=0, n=S.length();
        for(int i=1;i<n;i++){
            int s=i-1, e=i+1;
            while(s>=0 && e<n && S.charAt(s)==S.charAt(e)){
                if(e-s+1>len){
                      len=e-s+1;
                      start=s;
                      end=e;
                }
              
                s--;
                e++;
            }
            s=i-1;
            e=i;
              while(s>=0 && e<n && S.charAt(s)==S.charAt(e)){
                if(e-s+1>len){
                      len=e-s+1;
                      start=s;
                      end=e;
                }
              
                s--;
                e++;
            }
            
        }
        String ans="";
        for(int i=start;i<=end;i++){
            ans+=S.charAt(i);
        }
        return ans;
    }
}
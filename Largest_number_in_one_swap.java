class Solution {
    public String largestSwap(String S) {
        // code here
      char s[]= S.toCharArray();
         int ind=s.length-1;
         
         int pair[]={-1,-1};
         
         for(int i=s.length-1;i>=0;i--){
             if(s[i]>s[ind]){
                 ind=i;
             }
             else if(s[i]<s[ind]){
                 pair[0]=i;
                 pair[1]=ind;
             }
         }
         
         if(pair[0]==-1) return S;
         
        char c=s[pair[0]];
         s[pair[0]]=s[pair[1]];
         s[pair[1]]=c;
        
         return new String(s);   
    }
}
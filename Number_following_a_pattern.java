class Solution{
    static String printMinNumberForPattern(String s){
        // code here
       int n= s.length();
       int count =1;
       char[] ans= new char[n+1];
       for(int i=0;i<=n;i++){
           if(i == n || s.charAt(i) == 'I'){
               
               for(int j=i-1 ; j>=-1;j--){
                   ans[j+1]= (char)('0'+count);
                   count++;
                   if( j>=0 && s.charAt(j)  == 'I')
                   break;
               }
           }
       }
       return new String(ans);
    }
}


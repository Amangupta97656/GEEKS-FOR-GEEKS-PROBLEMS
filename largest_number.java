
class Solution{
    static String findLargest(int N, int S){
        // code 
      if(N >1 && S == 0)
      {
          return "-1";
          
      }
        if(S>9*N){
            return "-1";
        }
      String str = "";
      while(N > 0)
      {if(S > 9)
      {
          S = S - 9;
          str = str + "9";
      }
      else
      {
          str = str + S;
          S = 0;
      }
      N--;
          
      }
      return str;
      
    }
}
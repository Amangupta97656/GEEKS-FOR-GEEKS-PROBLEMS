class Solution {
   static int sum,count;
  static void recurse(int x,int y){
        if(x!=1){
            if(x%y==0){
                recurse(x/y,y);
                int a=y;
                count++;
                while(a>0){
                    sum+=a%10;
                    a=a/10;
                }
            }
            else recurse(x,y+1);
        }
    }
    static int smithNum(int n) {
        int sum1=0;
        sum=0;
        count=0;
        recurse(n,2);
        if(count<2) return 0;
        while(n>0){
            sum1+=n%10;
            n=n/10;
        }
        if(sum1==sum) return 1;
        else return 0;
    }
    
};
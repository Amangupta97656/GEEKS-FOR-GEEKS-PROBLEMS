
class Solution {
    
    public int countSubArrayProductLessThanK(long a[], int n, long k)
    {
  long p=0;
        int c=0;
        for(int i=0;i<n;i++){
            p=a[i];
            if(p<k) c++;
            if(p==0){
              c++;
              continue;
            }
            else{
                for(int j=i+1;j<n;j++){
                    p=p*a[j];
                    if(p<k){
                        c++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return c;
        
    }
}
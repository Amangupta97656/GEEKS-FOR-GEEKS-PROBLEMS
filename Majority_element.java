class Solution
{
    static int majorityElement(int a[], int size)
    {
      int c =0;
        int prev=0;
        
        
        
        for(int i=0;i<size;i++){
            if(c==0){
                prev=a[i];
            }
            if(prev==a[i]){
                c++;
                
            }else{
                c--;
            }
        }
        
       int count=0;
       for(int i=0;i<size;i++){
           if(a[i]==prev)count++;
       }
        
        if(count>size/2)return prev;
        return -1;
         
    }
    }

class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
       
        int prevmax =0;
        int maxIndex = -1;
        for(int i =0; i<N ; i++){
             int maxZero = 0;
            for(int j =0; j<N ; j++){
               if(arr[j][i]==0){
                   maxZero++;
               } 
               if(prevmax<maxZero){
                   prevmax = maxZero;
                   maxIndex = i;
               }
            }
        }
        return maxIndex ;
    }
}


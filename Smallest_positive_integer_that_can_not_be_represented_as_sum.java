class Solution { 
    long smallestpositive(long[] array, int n){ 
        // Your code goes here 
        Arrays.sort(array);
        long minVal=1;
        int i=0;
        while(i<n)
        {
            if(minVal<array[i])
            {
                return minVal;
            
            }
            else
            {
                minVal=minVal+array[i];
               
            }
             i++;
        }
        return minVal;
    }
} 
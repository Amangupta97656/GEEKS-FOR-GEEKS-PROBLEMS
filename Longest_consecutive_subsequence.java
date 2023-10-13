class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N)
    {
       // add your code here
       int maxi=0;
       Arrays.sort(arr);
       int lastS=Integer.MIN_VALUE,c=0;
       for(int i=0;i<N-1;i++)
       {
           if(arr[i+1]==arr[i])
           {
               continue;
           }
           else if(arr[i+1]==arr[i]+1)
           {
               lastS=arr[i+1];
               c++;
               maxi= Math.max(maxi,c);
               
           }
           else
           {
               c=0;
           }
       }
       return maxi+1;
    }
}


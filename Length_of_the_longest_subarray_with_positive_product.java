class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int n) { 
       int negative = -1 ;

 

       int negativeCount = 0 ;

 

       int count =0 ;

 

       int start = 0 ;

 

       for(int i=0 ; i<n ; i++){

 

           if(arr[i] == 0 ){

 

              start = i+1;

 

              negativeCount = 0;

 

              negative = -1 ;

 

              continue ;

 

            }

 

            // even and odd negative numbers

 

            if(arr[i]<0){

 

                negativeCount++; 

 

                if(negative==-1)

 

                    negative=i;

 

             }

 

             if(negativeCount%2==0){

 

                 // even

 

                 count = Math.max(count,i-start+1); 

 

             }

 

             else

 

             {

 

                count = Math.max(count,i-negative);

 

             }

 

       }

 

       return count ;

 

    }

 

}
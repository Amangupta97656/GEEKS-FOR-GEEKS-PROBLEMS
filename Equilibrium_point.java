class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

         long leftsum=0, rightsum=0;
        for(int i =0;i<n;i++ ){
           rightsum+=arr[i];
            
        }
        for(int i =0; i<n;i++){
            leftsum+=arr[i];
            if(leftsum==rightsum) 
                return i+1;
            rightsum -=arr[i];
        }
        
        return -1;
        
    }
}
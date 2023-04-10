class Solution{
    
  static long trappingWater(int arr[], int n) { 
       int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        
        //calculate rightMax boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        
        
        long trappedWater = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterlevel = min(leftMax boundary, rightMax boundary) 
            long waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            //trapped water = trapped water + waterlevel - height[i]
            trappedWater += waterLevel - arr[i];
        }
        
        return trappedWater;
    } 
}

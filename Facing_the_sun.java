class Solution {
    // Returns count buildings that can see sunlight
    
        public int countBuildings(int[] height) {
        // code here
        int count=1;
        int max=height[0];
        
        for(int i=1;i<height.length;i++){
            if(height[i]>height[i-1] && height[i]>max){
                count++;
                max=height[i];
            }
        }
        
        return count;
    }
}
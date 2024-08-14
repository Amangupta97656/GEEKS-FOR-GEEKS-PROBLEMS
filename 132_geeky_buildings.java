


class Solution{
   static int max=Integer.MIN_VALUE;
   static boolean recreationalSpot(int[] nums , int n){
       return find(nums,0);
   }
   
   public static boolean find(int[] nums,int n) {
       if(nums.length-n<3) return false;
       if(call(nums,n)){
           return true;
       }
      
       max=Math.max(max,nums[n]);
       while(nums.length-n>=3){
           if(nums[n+1]>max){
               n++;
           }
           else if(find(nums,++n)){
               return true;
           }
       }
       return false;
   }
   public static boolean call(int[] nums,int n){
       int i=nums[n];
       int j=nums[++n];
       while(n<nums.length-1){
           if(i>j){
               j=nums[++n];
           }
           if(n<nums.length-1 && i<j && i<nums[n+1]){
               if(nums[n+1]<j){
                   return true;
               }
               else{
                   j=nums[++n];
               }
           }
           else if(n<nums.length-1){
               n++;
           }
       }
       return false;
   }
};

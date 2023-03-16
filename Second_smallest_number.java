class Solution{
    static String secondSmallest(int S, int D){
        if(S==1 || S>=9*D || D==1)
            return "-1";
            
        int nums[] = new int[D];
        

        nums[0] = 1;
        S-=nums[0];

       //loop to find the smallest
        for(int i = D-1; i>0; i--){
            if(S>9){
                nums[i] = 9;
                S=S-9;
            }
            else{
                nums[i]= S;
                S = 0;
            }
            
        }
        if(S!=0){
            nums[0]+=S;
        }
        
       //loop to find the second smallest
        for(int i=D-1; i>0; i--){
            if(nums[i] <= 9 && nums[i-1]!=9){
                nums[i]-=1;
                nums[i-1]+=1;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<nums.length; i++){
            sb.append(nums[i]);
        }
        return sb.toString();
    }
}
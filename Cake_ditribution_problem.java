class Solution{
    int maxSweetness(int [] sweetness, int N, int K) {
        int max=0,min= Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(sweetness[i]<min) min= sweetness[i];
            max +=sweetness[i];
        }
        int ans=0,mid=0;
        while(min<=max){
            mid=(min+max)/2;
            if(checkPossible(mid,sweetness,N,K+1)){
                ans=mid;
                min=mid+1;
            }
            else max=mid-1;
        }
        return ans;
    }
    
    boolean checkPossible(int mid,int[] sweetness, int N, int K){
        int curr=0;
        for(int i=0;i<N;i++){
            curr += sweetness[i];
            if(curr>=mid){
                curr=0;
                K--;
            }
        }
        if(K<=0) return true;
        return false;
    }
}


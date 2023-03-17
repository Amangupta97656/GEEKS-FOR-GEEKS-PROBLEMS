class Solution{
	long no_of_subarrays(int N, int [] arr) {
		long ans=0;
		long count=0;
		for(int i=0;i<N;i++){
		    if(arr[i]==1){
		        ans=ans+(count*(count+1)/2);
		        count=0;
		    }
		    else{
		        count++;
		    }
		}
		ans=ans+(count*(count+1)/2);
		return ans;
	}
}
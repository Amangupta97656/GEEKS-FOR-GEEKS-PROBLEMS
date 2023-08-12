class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(a[0]);
        for(int i=1;i<size;i++){
            if(ans.get(ans.size()-1)<a[i]){
                ans.add(a[i]);
            }else{
                int c=getAns(ans,a[i]);
                ans.set(c,a[i]);
            }
        }
        return ans.size();
    }
    static int getAns(ArrayList<Integer>a,int x){
        int low=0,high=a.size()-1;
        int res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a.get(mid)==x){
                return mid;
            }else if(a.get(mid)<x){
                low=mid+1;
            }else{
                high=mid-1;
                res=mid;
            }
        }
        return res;
    }
} 
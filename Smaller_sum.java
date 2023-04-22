class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
    long ans[]=new long[n],pfx[]=new long[n];
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        pfx[0]=temp[0];
        map.put(temp[0],0);
        for(int i=1;i<n;i++){
            pfx[i]+=pfx[i-1]+temp[i];
            if(!map.containsKey(temp[i])) map.put(temp[i],i);
        }
        for(int i=0;i<n;i++){
            int idx=map.get(arr[i]);
            if(idx>0) ans[i]=pfx[idx-1];
        }
        return ans;
    }
}
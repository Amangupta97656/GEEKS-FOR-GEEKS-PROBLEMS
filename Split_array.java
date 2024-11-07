class Solution {
    public List<Integer> findSplit(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%3!=0) return Arrays.asList(-1,-1);
        int res=sum/3;
        int count=0;
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==res){
                list.add(i);
                sum=0;
                if(list.size()==2) return list;
            }
        }
        return Arrays.asList(-1,-1);
    }
}


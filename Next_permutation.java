class Solution {
    void nextPermutation(int[] nums) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        int n=arr.size();
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i)<arr.get(i+1)){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Collections.reverse(arr);
            //return arr;
        }
        else{
            for(int i=n-1;i>idx;i--){
            if(arr.get(i)>arr.get(idx)){
                int temp=arr.get(i);
                arr.set(i,arr.get(idx));
                arr.set(idx,temp);
                break;
            }
        }
        List<Integer> sublist=arr.subList(idx+1,n);
        Collections.reverse(sublist);
        } 
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        
    }
}
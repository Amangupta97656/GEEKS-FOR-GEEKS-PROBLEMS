class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        int j=0; int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>target){
                sum-=arr[j];
                j++;
            }
            if(sum==target){
                list.add(j+1);
                list.add(i+1);
                return list;
            }
        }
        
        list.add(-1);
        return list;
    }
  
} 
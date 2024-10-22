class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                sum+=1;
            }else if(arr[i]==y){
                sum-=1;
            }
            if(map.containsKey(sum)){
                ans+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        return ans;
    }
}
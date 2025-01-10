class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            int j=i;
            HashSet<Integer> set = new HashSet<>();
            while(j<i+k){
                set.add(arr[j]);
                j++;
            }
            ans.add(set.size());
        }
        return ans;
    }
}


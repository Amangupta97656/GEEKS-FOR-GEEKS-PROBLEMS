class Solution {

    public boolean checkDuplicatesWithinK(int[] arr, int k) {

        // your code

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int index = map.getOrDefault(arr[i],-1);

             if(index!=-1&&i-index<=k){

                return true;

            }

            else{

                map.put(arr[i],i);

            }

        }

        return false;

    }

}
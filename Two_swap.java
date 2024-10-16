class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int count = 0;
        for(int i = 0 ; i < arr.size() && count<2 ; i++){

            //if value not matched then swap with its respective position


            if(arr.get(i)!=i+1){
                count++;
                int temp = arr.get(i);
                arr.set(i,arr.get(temp-1));
                arr.set(temp-1,temp);
            }
        }

        //May be any case when only in one swap array will get sort Ex: 1,3,2,4 

        if(count==1) return false;

        //here check if in two swaps our arr get sorted or not

        for(int i = 0 ; i < arr.size()-1 ; i++){
            if(arr.get(i)>arr.get(i+1)) return false;
        }
        return true;
    }
}
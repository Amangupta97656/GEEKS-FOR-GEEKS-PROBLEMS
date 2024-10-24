class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        ArrayList<Integer> lt = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i] != 0 && arr[i] == arr[i+1]){
                arr[i] = 2*arr[i];
                arr[i+1] = 0;
                i++;
            }
        }
        int cnt = 0;
        for(int ele:arr){
            if(ele == 0) cnt++;
            else lt.add(ele);
        }
        while(cnt-- > 0){
            lt.add(0);
        }
        return lt;
    }
}


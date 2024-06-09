
class Solution {
    static void swap(int i, int j, int []arr) {
        
        //your code here
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void zigZag(int n, int[] arr) {
        boolean flag = true;
        
        for(int i = 0; i < n - 1; i++) {
            if(flag) {
                if(arr[i] > arr[i + 1])
                    swap(i, i + 1, arr);
            } else {
                if(arr[i] < arr[i + 1])
                    swap(i, i + 1, arr);
            }
            
            flag = !flag;
        }
    }
}
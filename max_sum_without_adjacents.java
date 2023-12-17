class Solution {
    int findMaxSum(int arr[], int n) {
        if(n ==1){
            return arr[0];
        }
        int num1 = arr[0];
        int num2 = Math.max(arr[0], arr[1]);
        
        for(int i = 2; i<n; i++){
            int temp = num2;
            num2 = Math.max(num1+arr[i], num2);
            num1 = temp;
        }
            
        
        
        return num2;
    }
}
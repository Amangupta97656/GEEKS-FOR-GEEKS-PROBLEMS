class Solution {
    int binarySearch(int[] arr, int low, int high, int x) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x)
                return mid;
            else if(arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return low;
    }
    
    int[] printKClosest(int[] arr, int n, int k, int x) {
        int position = binarySearch(arr, 0, n - 1, x);
        int left = position - 1, right = position, i = 0;
        int[] res = new int[k];
        
        if(right < n && arr[right] == x)
            right++;
        
        while(k > 0 && left >= 0 && right < n) {
            int leftDiff = Math.abs(arr[left] - x);
            int rightDiff = Math.abs(arr[right] - x);
            
            if(leftDiff < rightDiff) 
                res[i++] = arr[left--];
            
            else if(leftDiff > rightDiff) 
                res[i++] = arr[right++];
            
            else {
                if(arr[right] > arr[left]) 
                    res[i++] = arr[right++];
                else 
                    res[i++] = arr[left--];
            }
            
            k--;
        }
        
        while(k > 0 && left >= 0) {
            res[i++] = arr[left--];
            k--;
        }
        
        while(k > 0 && right < n) {
            res[i++] = arr[right++];
            k--;
        }
            
        return res;
    }
}
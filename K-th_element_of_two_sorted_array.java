class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
       int i = 0;
        int j = 0;
        int count = 0;

// Dont even have to merge , just iterate one by one and return 

// if (count == k) then return that element

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                count++;
                if (count == k) {
                    return arr1[i];
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2[j];
                }
                j++;
            }
        }

        // If we haven't found the kth element yet, we need to handle it here.
        while (i < n) {
            count++;
            if (count == k) {
                return arr1[i];
            }
            i++;
        }

        while (j < m) {
            count++;
            if (count == k) {
                return arr2[j];
            }
            j++;
        }

        return -1; // Return -1 if k is out of bounds.
        
        
    }
}
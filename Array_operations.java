class Solution {
    public static int arrayOperations(int n, int[] arr) {
		// code here

		int nonZeroLastIndex = -1;
		int prevZeroIndex = -1;
		
		int zeroesCount = 0;
		int operations = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				zeroesCount++;
				
				if (nonZeroLastIndex != -1 && prevZeroIndex != i - 1) {
					operations++;
				}
				
				prevZeroIndex = i;
			} else {
				nonZeroLastIndex = i;
				if(i == n - 1)
					operations++;
					
			}
		}
		if (zeroesCount == 0)
			return -1;
		else
			return operations;

	}
}
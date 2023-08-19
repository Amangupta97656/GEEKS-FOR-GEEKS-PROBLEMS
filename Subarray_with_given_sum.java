class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {

		ArrayList<Integer> ret = new ArrayList<Integer>(0);

		if (s == 0) {
			ret.add(-1);
			return ret;
		}

		int start = 0;
		int end = 0;
		int sum = 0;

		while (start < n && end < n) {

			sum += arr[end];

			while (sum > s && start <= end) {
				sum -= arr[start];
				start++;
			}

//			System.out.println("arr[end]: " + arr[end] + " start: " + start + " end: " + end + " sum:" + sum);

			if (sum == s) {
				ret.add(start + 1);
				ret.add(end + 1);
				return ret;
			} else if (sum < s) {
				end++;
			}
		}

		ret.add(-1);
		return ret;
	}
}
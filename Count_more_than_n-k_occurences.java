class Solution 
{
    public int countOccurence(int[] arr, int n, int k) 
    {
        int count = 0;
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        for (int key : elementCount.keySet()) {
            if (elementCount.get(key) > n / k) {
                count++;
            }
        }

        return count;
    }
}
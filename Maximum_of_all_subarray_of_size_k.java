
class Solution
{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        int s=0,e=k-1;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        while(e<arr.length){
            int curr = s;
            while(curr<=e){
                max = Math.max(arr[curr],max);
                curr++;
            }
            ans.add(max);
            max = Integer.MIN_VALUE;
            s++;
            e++;
        }
        return ans;
    }
}
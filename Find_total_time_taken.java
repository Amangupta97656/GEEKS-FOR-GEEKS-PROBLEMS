class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
    HashSet<Integer> set = new HashSet<>();
        int total=0;
        set.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                total+=1;
            }
            else{
                total+=time[arr[i]-1];
            }
        }
        return total;
    }
}
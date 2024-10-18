class Solution
{
    int getSingle(int arr[]) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mapele:map.entrySet())
        {
            int key=mapele.getKey();
            int value=mapele.getValue();
            if(value%2!=0)
            {
                return key;
            }
        }
        return -1;
    }
}
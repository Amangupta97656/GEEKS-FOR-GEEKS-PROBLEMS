class Solution 
{
    public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            int x = arr[i];
            int func = (A*(int) Math.pow(arr[i],2)) + (B*(arr[i])) + C;
            al.add(func);
        }
        
        Collections.sort(al);
        
        return al;
    }
}


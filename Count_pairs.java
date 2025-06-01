class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n=mat1.length;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                map.put(mat2[i][j],map.getOrDefault(0,1)+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int remaining=x-mat1[i][j];
                if(map.containsKey(remaining))
                {
                    count=count+1;
                }
            }
        }
        return count;
    }
}
class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<m; i++) {
            String str = "";
            for(int j=0; j<n; j++) {
                str += matrix[i][j];
            }
            if(set.contains(str))
                res.add(i);
            else
                set.add(str);
        }
        return res;
    }
}


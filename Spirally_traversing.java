class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        int n = mat.length, m = mat[0].length, total = n * m;
        int sr = 0, er = n - 1;
        int sc = 0, ec = m - 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        while (list.size() < total) {
            for (int i = sc; i <= ec && list.size() < total; i++) list.add(mat[sr][i]);
            sr++;
            for (int i = sr; i <= er && list.size() < total; i++) list.add(mat[i][ec]);
            ec--;
            for (int i = ec; i >= sc && list.size() < total; i--) list.add(mat[er][i]);
            er--;
            for (int i = er; i >= sr && list.size() < total; i--) list.add(mat[i][sc]);
            sc++;
        }
        
        return list;
    }
}
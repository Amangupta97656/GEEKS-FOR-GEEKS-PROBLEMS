class Solution{
    static boolean col[];
    static boolean d1[];
    static boolean d2[];
    static ArrayList<ArrayList<Integer> >ans;
    static void solve(int i, ArrayList<Integer>path, int n){
        // i denotes row number
        if(i==n+1){
            // You have placed N queens already
            ArrayList<Integer>temp = new ArrayList<>(path);
            ans.add(temp);
            return ;
        }
        for(int j=1;j<=n;j++){
            if(col[j]==true && d1[i+j]==true && d2[i-j+n]==true){
                // Recurse
                path.add(j);
                col[j] = false;
                d1[i+j] = false;
                d2[i-j+n] = false;
                solve(i+1, path, n);
 
                // Backtrack
                path.remove(path.size()-1);
                col[j] = true;
                d1[i+j] = true;
                d2[i-j+n] = true;
            }
        }
    }
 
    static ArrayList<ArrayList<Integer> > nQueen(int n) {
        // code here
        col = new boolean[n+1];
        d1 = new boolean[2*n+1];
        d2 = new boolean[2*n];
        Arrays.fill(col, true);
        Arrays.fill(d1, true);
        Arrays.fill(d2, true);
        ans = new ArrayList<>();
        ArrayList<Integer>path = new ArrayList<>();
        solve(1, path, n);
        return ans;
    }
}
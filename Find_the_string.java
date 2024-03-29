class Solution{

    public String findString(int n, int k){

        K = k;

        N = n;

        st.clear();

        if(n == 1) {

            char[] r = new char[k];

            for(int i = 0; i < k; i++)

                r[i] = (char)(i + '0');

            return new String(r);

        }

 

        tot = 1;

 

        for(int i = 1; i <= n; i++)

            tot *= k;

 

        char[] ansa = new char[n];

        Arrays.fill(ansa, '0');

        ans = new String(ansa);

        st.add(ans);

        dfs();

        return ans;

    }

 

    int K, N;

    long tot;

    HashSet<String> st = new HashSet<>();

    String ans;

 

    boolean dfs() {

        if(st.size() == tot) {

            return true;

        }

 

        String tmp = "";

        if(N > 1) {

            tmp = ans.substring(ans.length()-N+1);

        }

 

        for(int i = 0; i < K; i++) {

            tmp += i;

            if(!st.contains(tmp)) {

                ans += i;

                st.add(tmp);

                if(dfs())

                    return true;

                st.remove(tmp);

                ans = ans.substring(0, ans.length()-1);

            }

            tmp = tmp.substring(0, tmp.length()-1);

        }

 

        return false;

    }

}
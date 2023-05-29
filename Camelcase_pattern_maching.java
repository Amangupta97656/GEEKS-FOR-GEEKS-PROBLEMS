class Solution {
    ArrayList<String> CamelCase(int N, String[] Dictionary, String Pattern) {
        ArrayList<String> ans = new ArrayList<>();
        int len = Pattern.length();

        for (int i = 0; i < Dictionary.length; i++) {
            int j = 0;
            int k = 0;

            while (j < Dictionary[i].length() && k < len) {
                if (Character.isUpperCase(Dictionary[i].charAt(j))) {
                    if (Dictionary[i].charAt(j) == Pattern.charAt(k)) {
                        k++;
                    } else {
                        break;
                    }
                }
                j++;
            }

            if (k == len) {
                ans.add(Dictionary[i]);
            }
        }

        if (ans.size() == 0) {
            ans.add("-1");
        }
        
        Collections.sort(ans);

        return ans;
    }
}
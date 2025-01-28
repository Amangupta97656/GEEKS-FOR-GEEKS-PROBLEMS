class Solution {
    public ArrayList<String> findPermutation(String s) {
        HashSet<String> set = new HashSet<>(); 
        char[] chars = s.toCharArray();
        permutation(chars, 0, set);
        return new ArrayList<>(set); 
    }

    private void permutation(char[] chars, int idx, HashSet<String> set) {
        if (idx == chars.length) {
            set.add(new String(chars)); 
            return;
        }

        for (int i = idx; i < chars.length; i++) {
            swap(chars, i, idx); 
            permutation(chars, idx + 1, set); 
            swap(chars, i, idx); 
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}


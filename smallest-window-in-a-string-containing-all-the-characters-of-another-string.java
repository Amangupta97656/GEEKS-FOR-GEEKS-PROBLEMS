class Solution {
    // Function to find the smallest window in the string s consisting
    // of all the characters of string p.
    public static String smallestWindow(String s, String p) {
        
        if(p.length() == 1){
            char ch = p.charAt(0);
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)== ch)
                return ch+"";
            }
            return "-1";
        }
        
        
        HashMap<Character, Integer> freq = new HashMap<>();
        int need = p.length();

        HashMap<Character, Integer> window = new HashMap<>();
        int have = 0;

        char[] temp = p.toCharArray();

        for (char ch : temp) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            window.put(ch, 0);
        }

        int left = 0, right = 0, len = Integer.MAX_VALUE, i = 0, j = 0;

        temp = s.toCharArray();

        while (i < temp.length) {
            char ch = temp[i];

            if (freq.containsKey(ch) && window.containsKey(ch)) {
                if (window.get(ch) < freq.get(ch)) {
                    have++;
                }
                window.put(ch, window.get(ch) + 1);
            }

            while (j < i && have == need) {
                char key = temp[j];
                
                int size = i - j + 1;
                if (size < len) {
                    len = size;
                    left = j;
                    right = i;
                }
                
                if (window.containsKey(key) && freq.containsKey(key)) {
                    window.put(key, window.get(key) - 1);
                    if (window.get(key) < freq.get(key)) {
                        have--;
                    }
                }

                j++;
            }
            i++;
        }

        if (len == Integer.MAX_VALUE) {
            return "-1";
        } else {
            return s.substring(left, right + 1);
        }
    }
}
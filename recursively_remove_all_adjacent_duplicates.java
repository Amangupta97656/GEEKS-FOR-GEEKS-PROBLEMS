class Solution{
    String rremove(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            int j = i;
            // Find the index of the first different character
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            
            if (j - i > 1) {
                // There are adjacent duplicates, skip them
                i = j;
            } else {
                // No adjacent duplicates, add the character to the result
                result.append(s.charAt(i));
                i++;
            }
        }
        
        // If the result string has changed, recursively call the function
        if (result.length() < n) {
            return rremove(result.toString());
        } else {
            return result.toString();
        }
    }
}
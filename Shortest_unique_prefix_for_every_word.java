class Solution {
   private static class TrieNode {
        int frequency;
        TrieNode[] children;
        
        TrieNode() {
            frequency = 0;
            children = new TrieNode[26];
            
            for(int i = 0 ; i < 26 ; i++) {
                children[i] = null;
            }
        }
   }
   
   private static TrieNode root;
   
   private static void buildTrie(String str) {
       TrieNode current = root;
       
       for(char ch : str.toCharArray()) {
           int index = ch - 'a';
           
           if(current.children[index] == null) {
                current.children[index] = new TrieNode();   
           }
           
           current.children[index].frequency++; 
           current = current.children[index];
       }
   }
   
   private static String buildPrefix(String str) {
       TrieNode current = root;
       StringBuilder sb = new StringBuilder();
       
       for(char ch : str.toCharArray()) {
           int index = ch - 'a';
           sb.append(ch);
           
           if(current.children[index].frequency == 1) {
                break; 
           }
           
           current = current.children[index];
       }
       
       return sb.toString();
   }
   
   static String[] findPrefixes(String[] arr, int n) {
        root = new TrieNode();
        String[] result = new String[n];
        
        for(int i = 0 ; i < n ; i++) {
            buildTrie(arr[i]);
        }
        
        for(int i = 0 ; i < n ; i++) {
            result[i] = buildPrefix(arr[i]);
        }
        
        return result;
   }
};
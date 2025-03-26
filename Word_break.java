class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        TrieNode root = buildTrie(dictionary);
        int n = s.length();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1]; // To avoid duplicate processing

        queue.add(0);
        while (!queue.isEmpty()) {
            int start = queue.poll();
            if (visited[start]) continue; // Skip already visited indexes
            visited[start] = true;

            TrieNode node = root;
            for (int end = start; end < n; end++) {
                char c = s.charAt(end);
                if (node.children[c - 'a'] == null) break; // No further match
                node = node.children[c - 'a'];
                if (node.isEnd) queue.add(end + 1); // Found a valid word
            }

            if (visited[n]) return true; // Reached the end
        }

        return false;
    }

    private TrieNode buildTrie(String[] dictionary) {
        TrieNode root = new TrieNode();
        for (String word : dictionary) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.isEnd = true; // Mark end of a word
        }
        return root;
    }
}


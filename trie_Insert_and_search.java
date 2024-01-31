static void insert(TrieNode root, String key) 
{
    TrieNode node  = root;
    for(char c : key.toCharArray()){
        if(node.children[c-'a']==null){
            node.children[c-'a'] = new TrieNode();
        }
        node = node.children[c-'a'];
    }
    node.isEndOfWord = true;
    // Your code here
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    // Your code here
    TrieNode node = root;
    for(char c : key.toCharArray()){
        if(node.children[c-'a']==null)return false;
        node = node.children[c-'a'];
    }
    return node.isEndOfWord;
}


public class InsertAndSearchInTrie {
    public static void main(String[] args) {

    }

    static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };

    static void insert(TrieNode root, String key) {
        // Your code here
        TrieNode temp = root;
        for (char ch : key.toCharArray()) {
            if (temp.children[ch - 'a'] == null) {
                temp.children[ch - 'a'] = new TrieNode();
            }
            temp = temp.children[ch - 'a'];
        }
        temp.isEndOfWord = true;
    }

    // Function to use TRIE data structure and search the given string.
    static boolean search(TrieNode root, String key) {
        // Your code here
        TrieNode temp = root;
        for (char ch : key.toCharArray()) {
            if (temp.children[ch - 'a'] == null)
                return false;
            temp = temp.children[ch - 'a'];
        }
        return temp.isEndOfWord;
    }
}
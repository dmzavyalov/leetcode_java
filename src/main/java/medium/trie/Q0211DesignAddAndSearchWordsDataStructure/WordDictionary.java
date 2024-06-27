package medium.trie.Q0211DesignAddAndSearchWordsDataStructure;

/*
https://leetcode.com/problems/design-add-and-search-words-data-structure/

String, Depth-First Search, Design, Trie

 */


public class WordDictionary {
    private static class TrieNode {
        private TrieNode[] children = new TrieNode[26];
        private boolean endOfWord = false;
    }
    private TrieNode root = new TrieNode();

    public void addWord(String word) {
        var current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.endOfWord = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int j, TrieNode node) {
        var current = node;
        for (int i = j; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                //For dot patter we need to look through all existing children of the node
                for (TrieNode child : current.children) {
                    //Pass down position in the word to continue the search from as j
                    if (child != null && dfs(word, i + 1, child)) {
                        //On first match found we immediately return true
                        return true;
                    }
                }
                return false;
            } else {    //A regular character
                int index = c - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
        }
        return current.endOfWord;
    }

}

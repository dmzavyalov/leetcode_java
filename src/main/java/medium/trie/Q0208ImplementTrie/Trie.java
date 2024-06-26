package medium.trie.Q0208ImplementTrie;

/*
https://leetcode.com/problems/implement-trie-prefix-tree/

Hash Table, String, Design, Trie

 */

public class Trie {
    private static class TrieNode {
        private TrieNode[] children = new TrieNode[26];
        private boolean endOfWord = false;
    }

    private TrieNode root = new TrieNode();

    public void insert(String word) {
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
        var current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.endOfWord;
    }

    public boolean startsWith(String prefix) {
        var current = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
}

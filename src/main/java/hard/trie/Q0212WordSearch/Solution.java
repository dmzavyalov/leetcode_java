package hard.trie.Q0212WordSearch;

/*
https://leetcode.com/problems/word-search-ii/description/

Array, String, Backtracking, Trie, Matrix

 */

import java.util.*;


public class Solution {

    //Hashmap-based implementation, for a change, to see how a more universal solution
    //which does not limit the set of characters to a-z will look like
    //It also has reference counter to track word removal
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWord = false;
        int refs = 0;

        void addWord(String word) {
            TrieNode cur = this;
            cur.refs++;
            for (char c : word.toCharArray()) {
                cur.children.putIfAbsent(c, new TrieNode());
                cur = cur.children.get(c);
                cur.refs++;
            }
            cur.isWord = true;
        }

        void removeWord(String word) {
            TrieNode cur = this;
            cur.refs--;
            for (char c : word.toCharArray()) {
                if (cur.children.containsKey(c)) {
                    cur = cur.children.get(c);
                    cur.refs--;
                }
            }
        }

    }


    int ROWS, COLS;


    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<>();  //Use a set to eliminate duplicates
        Set<String> visit = new HashSet<>();

        //Fill the trie with words
        TrieNode root = new TrieNode();
        for (String word : words) {
            root.addWord(word);
        }

        ROWS = board.length;
        COLS = board[0].length;

        //Use each cell as a possible starting position
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                dfs(r, c, root, "", board, res, visit, root);
            }
        }

        return new ArrayList<>(res);
    }

    private void dfs(int r, int c, TrieNode node, String word, char [][] board, Set<String> res, Set<String> visit, TrieNode root) {
        if (r < 0 || r >= ROWS || c < 0 || c >= COLS ||   //Out of the grid
            !node.children.containsKey(board[r][c]) ||  //Cell value is not among the trie node children
            node.children.get(board[r][c]).refs < 1 ||  //Word was deleted
            visit.contains(r + "," + c) //Cell already visited
        ) {
            return;
        }

        visit.add(r + "," + c); //Mark cell as visited
        node = node.children.get(board[r][c]); //Descend into the trie
        word += board[r][c]; //Extend the current match so far
        if (node.isWord) { //Match found
            node.isWord = false;
            res.add(word);  //Add it to the result set
            root.removeWord(word);  //Remove the word so that we won't search for it again
        }

        //Attempt to advance in all possible directions from the current cell
        dfs(r + 1, c, node, word, board, res, visit, root);
        dfs(r -1 , c, node, word, board, res, visit, root);
        dfs(r, c + 1, node, word, board, res, visit, root);
        dfs(r, c - 1, node, word, board, res, visit, root);

        visit.remove(r + "," + c); //Clear the visited flag once all paths leading from the cell has been explored
    }
}

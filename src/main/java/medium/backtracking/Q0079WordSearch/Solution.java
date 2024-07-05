package medium.backtracking.Q0079WordSearch;

/*

https://leetcode.com/problems/word-search/

Array, String, Backtracking, Matrix

Time: O(N * M * 4 ^ Word Length)

 */

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private int ROWS, COLS;
    private String word;
    private char[][] board;
    private Set<String> visited;

    public boolean exist(char[][] board, String word) {
        if (null == board || board.length == 0 || board[0].length == 0) {
            return false;
        }

        ROWS = board.length;
        COLS = board[0].length;
        this.word = word;
        this.board = board;

        this.visited = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (dfs(row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int row, int col, int i) {
        if (i == word.length()) {   //We've found the word
            return true;
        }
        if (row < 0 || col < 0 || row >= ROWS || col >= COLS) { //Out of the board
            return false;
        }
        if (word.charAt(i) != board[row][col]) { //Character on this path doesn't match
            return false;
        }
        if (visited.contains(getPosition(row, col))) { //We've already visited this cell on the current path
            return false;
        }

        visited.add(getPosition(row, col));
        var result =
            dfs(row + 1, col, i + 1) ||
            dfs(row - 1, col, i + 1) ||
            dfs(row, col + 1, i + 1) ||
            dfs(row, col - 1, i + 1);
        visited.remove(getPosition(row, col));

        return result;
    }

    private String getPosition(int row, int col) {
        return row + "," + col;
    }
}

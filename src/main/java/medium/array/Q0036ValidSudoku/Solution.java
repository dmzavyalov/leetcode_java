package medium.array.Q0036ValidSudoku;

/*

https://leetcode.com/problems/valid-sudoku/

Topics: Array, Hash Table, Matrix

Time: O(board.length^2)
Space: O(board.length)

 */


import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] cols = new Set[board.length];
        for (int c = 0; c < cols.length; c++) {
            cols[c] = new HashSet<>();
        }

        Set<Character>[] rows = new Set[board.length];
        for (int r = 0; r < rows.length; r++) {
            rows[r] = new HashSet<>();
        }

        Set<Character>[] blocks = new Set[board.length];
        for (int b = 0; b < board.length; b++) {
            blocks[b] = new HashSet<>();
        }

        for (int c = 0; c < board.length; c++) {
            for (int r = 0; r < board.length; r++) {
                if (board[c][r] == '.') {
                    continue;
                }
                var b = c / 3 + (r / 3) * 3;

                if (cols[c].contains(board[c][r]) ||
                    rows[r].contains(board[c][r]) ||
                    blocks[b].contains(board[c][r])) {
                    return false;
                }

                cols[c].add(board[c][r]);
                rows[r].add(board[c][r]);
                blocks[b].add(board[c][r]);
            }
        }

        return true;
    }
}

package medium.graph.Q0130SurroundedRegions;

/*

https://leetcode.com/problems/surrounded-regions/description/

Array, Depth-First Search, Breadth-First Search, Union Find, Matrix

Time: O(n*m)

 */

public class Solution {
    int ROWS, COLS;

    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;

        //Mark not surrounded regions (O->T)

        //Top and bottom row
        for (int c = 0; c < COLS; c++) {
            if (board[0][c] == 'O') {
                dfs(board, 0, c);
            }
            if (board[ROWS - 1][c] == 'O') {
                dfs(board, ROWS - 1, c);
            }
        }

        //Left and right columns
        for (int r = 0; r < ROWS; r++) {
            if (board[r][0] == 'O') {
                dfs(board, r, 0);
            }
            if (board[r][COLS - 1] == 'O') {
                dfs(board, r, COLS - 1);
            }
        }

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';  //Capture surrounded (O->X)
                }
                if (board[r][c] == 'T') {
                    board[r][c] = 'O';  //Turn not surrounded mark back (T->O)
                }
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= ROWS || c < 0 || c >= COLS || board[r][c] != 'O') {
            return;
        }
        board[r][c] = 'T';
        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}

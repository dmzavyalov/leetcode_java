package hard.backtracking.Q0051NQueens;

import java.util.*;

/*

https://leetcode.com/problems/n-queens/

Array, Backtracking

 */

public class Solution {
    Set<Integer> col;
    Set<Integer> posDiag;
    Set<Integer> negDiag;

    private List<List<String>> result;
    private int n;
    private char[][] board;

    public List<List<String>> solveNQueens(int n) {
        col = new HashSet<>();
        posDiag = new HashSet<>();
        negDiag = new HashSet<>();
        this.n = n;
        this.board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        result = new ArrayList<>();

        backtrack(0);

        return result;
    }

    //Walk row by row
    private void backtrack(int r) {
        if (r == n) {
            result.add(boardToListOfStrings());
            return;
        }

        //Walk column by column
        for (int c = 0; c < n; c++) {
            //If there is a queen on the same column, positive or negative diagonal
            //For positive diagonals row + column stay constant
            //For negative diagonals row - column stay constant
            //This way we can maintain three additional arrays to quickly check where previous queens have been placed
            if (col.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c)) {
                continue;   //Then we can't place another queen in this position
            }

            //Place a new queen
            col.add(c);
            posDiag.add(r + c);
            negDiag.add(r - c);
            board[r][c] = 'Q';

            //Explore solutions with the queen placed
            backtrack(r + 1);

            //Remove the placed queen, explore other solutions
            board[r][c] = '.';
            negDiag.remove(r - c);
            posDiag.remove(r + c);
            col.remove(c);
        }

    }

    private List<String> boardToListOfStrings() {
        return Arrays.stream(board)
            .map(row -> {
                var builder = new StringBuilder();
                for (char c : row) {
                    builder.append(c);
                }
                return builder.toString();
            })
            .toList();
    }
}

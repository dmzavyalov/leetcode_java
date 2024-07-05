package medium.backtracking.Q0079WordSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var board = new char[][] {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertTrue(new Solution().exist(board, "ABCCED"));
    }

    @Test
    void testTwo() {
        var board = new char[][] {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertTrue(new Solution().exist(board, "SEE"));
    }

    @Test
    void testThree() {
        var board = new char[][] {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        assertFalse(new Solution().exist(board, "ABCB"));
    }
}
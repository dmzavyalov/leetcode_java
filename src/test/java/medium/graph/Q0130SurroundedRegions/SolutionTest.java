package medium.graph.Q0130SurroundedRegions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testOne() {
        var board = new char[][]{
            {'X','X','X','X'},
            {'X','O','O','X'},
            {'X','X','O','X'},
            {'X','O','X','X'}      
        };

        var expected = new char[][]{
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','X','X','X'},
            {'X','O','X','X'}
        };

        new Solution().solve(board);
        assertArrayEquals(expected, board);
    }

    @Test
    void testTwo() {
        var board = new char[][]{{'X'}};
        var expected = new char[][]{{'X'}};

        new Solution().solve(board);
        assertArrayEquals(expected, board);
    }
}
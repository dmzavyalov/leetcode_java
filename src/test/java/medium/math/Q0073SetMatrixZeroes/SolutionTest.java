package medium.math.Q0073SetMatrixZeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var expected = new int[][]{{1,0,1},{0,0,0},{1,0,1}};
        var actual = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        new Solution().setZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwo() {
        var expected = new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        var actual = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new Solution().setZeroes(actual);
        assertArrayEquals(expected, actual);
    }
}
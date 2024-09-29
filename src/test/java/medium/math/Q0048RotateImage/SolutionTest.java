package medium.math.Q0048RotateImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var expected = new int[][]{{7,4,1},{8,5,2},{9,6,3}};
        var actual = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        new Solution().rotate(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testTwo() {
        var expected = new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        var actual = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        new Solution().rotate(actual);
        assertArrayEquals(expected, actual);
    }
}
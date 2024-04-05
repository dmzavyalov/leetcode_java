package medium.binarySearch.Q0074Search2DMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testOne() {
        final var matrix = new int [][] {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        assertTrue(new Solution().searchMatrix(matrix, 3));
    }

    @Test
    void testTwo() {
        final var matrix = new int [][] {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        assertFalse(new Solution().searchMatrix(matrix, 13));
    }
}

package medium.array.Q0238ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[] {24,12,8,6},
            new Solution().productExceptSelf(new int[] {1,2,3,4})
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[] {0,0,9,0,0},
            new Solution().productExceptSelf(new int[] {-1,1,0,-3,3})
        );
    }
}

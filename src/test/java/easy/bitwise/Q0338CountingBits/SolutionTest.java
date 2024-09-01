package easy.bitwise.Q0338CountingBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(new int[] {0, 1, 1}, new Solution().countBits(2));
    }

    @Test
    void testTwo() {
        assertArrayEquals(new int[] {0,1,1,2,1,2}, new Solution().countBits(5));
    }
}
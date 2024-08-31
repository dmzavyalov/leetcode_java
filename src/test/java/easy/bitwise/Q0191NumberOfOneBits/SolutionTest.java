package easy.bitwise.Q0191NumberOfOneBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().hammingWeight(11));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().hammingWeight(128));
    }

    @Test
    void testThree() {
        assertEquals(30, new Solution().hammingWeight(2147483645));
    }
}
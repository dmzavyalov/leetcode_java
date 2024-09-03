package easy.bitwise.Q0190ReverseBits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(964176192, new Solution().reverseBits(43261596));
    }

    @Test
    void testTwo() {
        assertEquals(-1073741825, new Solution().reverseBits(-3));
    }
}
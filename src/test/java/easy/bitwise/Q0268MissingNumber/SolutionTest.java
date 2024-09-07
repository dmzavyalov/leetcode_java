package easy.bitwise.Q0268MissingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().missingNumber(new int[]{3,0,1}));
    }

    @Test
    void testTwo() {
        assertEquals(2, new Solution().missingNumber(new int[]{0,1}));
    }

    @Test
    void testThree() {
        assertEquals(8, new Solution().missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
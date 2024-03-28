package medium.stack.Q0853CarFleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testOne() {
        assertEquals(3, new Solution().carFleet(12, new int[] {10,8,0,5,3}, new int[]{2,4,1,1,3}));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().carFleet(10, new int[] {3}, new int[]{3}));
    }

    @Test
    void testThree() {
        assertEquals(1, new Solution().carFleet(100, new int[] {0,2,4}, new int[]{4,2,1}));
    }
}

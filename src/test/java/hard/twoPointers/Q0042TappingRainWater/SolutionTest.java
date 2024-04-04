package hard.twoPointers.Q0042TappingRainWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        assertEquals(6, new Solution().trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    void testTwo() {
        assertEquals(9, new Solution().trap(new int[] {4,2,0,3,2,5}));
    }
}

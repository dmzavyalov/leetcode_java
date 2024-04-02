package medium.twoPointers.Q0011ContainerWithMostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        assertEquals(49, new Solution().maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().maxArea(new int[] {1,1}));
    }
}

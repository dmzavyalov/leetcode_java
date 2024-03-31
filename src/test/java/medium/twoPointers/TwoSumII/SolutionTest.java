package medium.twoPointers.TwoSumII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testOne() {
        assertArrayEquals(new int[] {1,2}, new Solution().twoSum(new int[] {2,7,11,15}, 9));
    }

    @Test
    void testTwo() {
        assertArrayEquals(new int[] {1,3}, new Solution().twoSum(new int[] {2,3,4}, 6));
    }

    @Test
    void testThree() {
        assertArrayEquals(new int[] {1,2}, new Solution().twoSum(new int[] {-1,0}, -1));
    }
}

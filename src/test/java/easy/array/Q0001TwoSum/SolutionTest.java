package easy.array.Q0001TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[] {0,1},
            new Solution().twoSum(new int[] {2,7,11,15}, 9)
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[] {1,2},
            new Solution().twoSum(new int[] {3,2,4}, 6)
        );
    }

    @Test
    void testThree() {
        assertArrayEquals(
            new int[] {0,1},
            new Solution().twoSum(new int[] {3,3}, 6)
        );
    }
}

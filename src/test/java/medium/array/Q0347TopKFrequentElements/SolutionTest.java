package medium.array.Q0347TopKFrequentElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testOne() {
        assertArrayEquals(
            new Solution().topKFrequent(new int[] {1,1,1,2,2,3}, 2),
            new int[] {1, 2}
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new Solution().topKFrequent(new int[] {1}, 1),
            new int[] {1}
        );
    }
}

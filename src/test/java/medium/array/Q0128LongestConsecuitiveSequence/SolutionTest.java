package medium.array.Q0128LongestConsecuitiveSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            4,
            new Solution().longestConsecutive(new int[] {100,4,200,1,3,2})
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            9,
            new Solution().longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1})
        );
    }
}

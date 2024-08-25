package medium.greedy.Q0134GasStation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(3, new Solution().canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
    }

    @Test
    void testTwo() {
        assertEquals(-1, new Solution().canCompleteCircuit(new int[] {2,3,4}, new int[] {3,4,3}));
    }
}
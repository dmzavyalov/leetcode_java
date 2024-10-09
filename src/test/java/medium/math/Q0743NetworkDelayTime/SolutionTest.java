package medium.math.Q0743NetworkDelayTime;

import medium.graph.Q0743NetworkDelayTime.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(2, new Solution().networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4,2));
    }

    @Test
    void testTwo() {
        assertEquals(1, new Solution().networkDelayTime(new int[][]{{1,2,1}}, 2,1));
    }

    @Test
    void testThree() {
        assertEquals(-1, new Solution().networkDelayTime(new int[][]{{1,2,1}}, 2,2));
    }
}
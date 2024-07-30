package medium.graph.Q0207CourseSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertTrue(new Solution().canFinish(2, new int[][] {{1,0}}));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().canFinish(2, new int[][] {{1,0}, {0,1}}));
    }
}
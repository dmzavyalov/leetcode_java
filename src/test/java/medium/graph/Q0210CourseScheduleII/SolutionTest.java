package medium.graph.Q0210CourseScheduleII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(new int[]{0,1}, new Solution().findOrder(2, new int[][]{{1,0}}));
    }

    @Test
    void testTwo() {
        assertArrayEquals(new int[]{0,1,2,3}, new Solution().findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}));
    }

    @Test
    void testThree() {
        assertArrayEquals(new int[]{0}, new Solution().findOrder(1, new int[][]{}));
    }
}
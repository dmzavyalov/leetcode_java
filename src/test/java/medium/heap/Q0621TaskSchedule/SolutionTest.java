package medium.heap.Q0621TaskSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(8, new Solution().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
    }

    @Test
    void testTwo() {
        assertEquals(6, new Solution().leastInterval(new char[]{'A', 'C', 'A', 'B', 'D', 'B'}, 1));
    }

    @Test
    void testThree() {
        assertEquals(10, new Solution().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 3));
    }
}
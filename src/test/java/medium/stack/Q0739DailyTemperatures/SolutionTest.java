package medium.stack.Q0739DailyTemperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new int[] {1,1,4,2,1,1,0,0},
            new Solution().dailyTemperatures(new int[] {73,74,75,71,69,72,76,73})
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new int[] {1,1,1,0},
            new Solution().dailyTemperatures(new int[] {30,40,50,60})
        );
    }

    @Test
    void testThree() {
        assertArrayEquals(
            new int[] {1,1,0},
            new Solution().dailyTemperatures(new int[] {30,60,90})
        );
    }
}

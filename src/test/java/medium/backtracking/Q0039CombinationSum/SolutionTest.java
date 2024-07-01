package medium.backtracking.Q0039CombinationSum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var result = new Solution().combinationSum(new int[] {2,3,6,7}, 7);
        assertEquals(List.of(List.of(2,2,3), List.of(7)), result);
    }

    @Test
    void testTwo() {
        var result = new Solution().combinationSum(new int[] {2,3,5}, 8);
        assertEquals(List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5)), result);
    }

    @Test
    void testThree() {
        var result = new Solution().combinationSum(new int[] {2}, 1);
        assertEquals(List.of(), result);
    }
}
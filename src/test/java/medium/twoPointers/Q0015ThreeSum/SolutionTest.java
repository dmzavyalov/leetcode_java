package medium.twoPointers.Q0015ThreeSum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testOne() {
        assertEquals(
            List.of(List.of(-1,-1,2), List.of(-1,0,1)),
            new Solution().threeSum(new int[] {-1,0,1,2,-1,-4})
        );
    }

    @Test
    void testTwo() {
        assertEquals(
            List.of(),
            new Solution().threeSum(new int[] {0,1,1})
        );
    }

    @Test
    void testThree() {
        assertEquals(
            List.of(List.of(0,0,0)),
            new Solution().threeSum(new int[] {0,0,0})
        );
    }
}

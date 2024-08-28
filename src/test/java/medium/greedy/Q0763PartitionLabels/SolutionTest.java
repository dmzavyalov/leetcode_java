package medium.greedy.Q0763PartitionLabels;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(List.of(9,7,8), new Solution().partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    void testTwo() {
        assertEquals(List.of(10), new Solution().partitionLabels("eccbbbbdec"));
    }
}
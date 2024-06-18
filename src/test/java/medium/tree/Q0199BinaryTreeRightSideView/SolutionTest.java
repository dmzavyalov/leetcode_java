package medium.tree.Q0199BinaryTreeRightSideView;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        var input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{1,2,3,null,5,null,4});
        var output = new Solution().rightSideView(input);
        assertEquals(List.of(1,3,4), output);
    }

    @Test
    void testTwo() {
        var input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{1,null,3});
        var output = new Solution().rightSideView(input);
        assertEquals(List.of(1,3), output);
    }

    @Test
    void testThree() {
        var input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{});
        var output = new Solution().rightSideView(input);
        assertEquals(List.of(), output);
    }
}
package hard.tree.Q0124BinaryTreeMaximumPathSum;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testOne() {
        assertEquals(6, new Solution().maxPathSum(TreeHelper.arrayToTreeLevelOrder(new Integer[]{1, 2, 3})));
    }

    @Test
    void testTwo() {
        assertEquals(42, new Solution().maxPathSum(TreeHelper.arrayToTreeLevelOrder(new Integer[]{-10,9,20,null,null,15,7})));
    }
}
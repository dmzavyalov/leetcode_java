package medium.tree.Q1448CountGoodNodesInBinaryTree;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertEquals(4, new Solution().goodNodes(TreeHelper.arrayToTreeLevelOrder(new Integer[]{3,1,4,3,null,1,5})));
    }

    @Test
    void testTwo() {
        assertEquals(3, new Solution().goodNodes(TreeHelper.arrayToTreeLevelOrder(new Integer[]{3,3,null,4,2})));
    }

    @Test
    void testThree() {
        assertEquals(1, new Solution().goodNodes(TreeHelper.arrayToTreeLevelOrder(new Integer[]{1})));
    }
}
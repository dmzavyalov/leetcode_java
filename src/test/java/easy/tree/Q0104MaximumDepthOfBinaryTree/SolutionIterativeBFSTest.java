package easy.tree.Q0104MaximumDepthOfBinaryTree;

import dataStructures.TreeNode;
import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionIterativeBFSTest {
    @Test
    void testOne() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {3,9,20,null,null,15,7});
        assertEquals(new SolutionIterativeBFS().maxDepth(input), 3);
    }

    @Test
    void testTwo() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[] {1,null,2});
        assertEquals(new SolutionIterativeBFS().maxDepth(input), 2);
    }
}
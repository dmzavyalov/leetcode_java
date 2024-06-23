package medium.tree.Q0105ConstructBinaryTreeFromPreorderAndInorderTraversal;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertArrayEquals(
            new Integer[]{3,9,20,null,null,15,7},
            TreeHelper.treeToArrayLevelOrder(new Solution().buildTree(
                new int[] {3,9,20,15,7},
                new int[] {9,3,15,20,7}
            ))
        );
    }

    @Test
    void testTwo() {
        assertArrayEquals(
            new Integer[]{-1},
            TreeHelper.treeToArrayLevelOrder(new Solution().buildTree(
                new int[] {-1},
                new int[] {-1}
            ))
        );
    }
}
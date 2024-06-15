package easy.tree.Q0572SubtreeOfAnotherTree;

import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        assertTrue(new Solution().isSubtree(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {3,4,5,1,2}),
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {4,1,2})
        ));
    }

    @Test
    void testTwo() {
        assertFalse(new Solution().isSubtree(
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {3,4,5,1,2,null,null,null,null,0}),
            TreeHelper.arrayToTreeLevelOrder(new Integer[] {4,1,2})
        ));
    }
}
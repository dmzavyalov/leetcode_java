package hard.tree.Q0297SerializeAndDeserializeBinaryTree;

import dataStructures.TreeNode;
import helper.TreeHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testOne() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{1,2,3,null,null,4,5});

        String serialized = new Codec().serialize(input);
        assertEquals("1,2,N,N,3,4,N,N,5,N,N", serialized);

        TreeNode deserialized = new Codec().deserialize(serialized);
        assertArrayEquals(
            TreeHelper.treeToArrayLevelOrder(deserialized),
            TreeHelper.treeToArrayLevelOrder(input)
        );
    }

    @Test
    void testTwo() {
        TreeNode input = TreeHelper.arrayToTreeLevelOrder(new Integer[]{});

        String serialized = new Codec().serialize(input);
        assertEquals("N", serialized);

        TreeNode deserialized = new Codec().deserialize(serialized);
        assertArrayEquals(
            TreeHelper.treeToArrayLevelOrder(deserialized),
            TreeHelper.treeToArrayLevelOrder(input)
        );
    }

}
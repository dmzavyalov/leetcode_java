package medium.tree.Q0098ValidateBinarySearchTree;

import dataStructures.TreeNode;

/*
https://leetcode.com/problems/validate-binary-search-tree/

Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(n)
Space: O(log n)

 */

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return
            isValid(node.left, min, node.val) &&    //Update the upper boundary
            isValid(node.right, node.val, max)      //Update the lower boundary
        ;
    }
}

package easy.tree.Q0543DiameterOfBinaryTree;

import dataStructures.TreeNode;

/*
https://leetcode.com/problems/diameter-of-binary-tree/

Topics: Tree, Depth-First Search, Binary Tree

Time: O(n)
Space: O(1)
 */

public class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);
        max = Math.max(max, 2 + leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

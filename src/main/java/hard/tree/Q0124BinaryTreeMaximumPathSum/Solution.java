package hard.tree.Q0124BinaryTreeMaximumPathSum;

/*

https://leetcode.com/problems/binary-tree-maximum-path-sum/description/


Dynamic Programming, Tree, Depth-First Search, Binary Tree

Time: O(n)
Space: O(height)

 */

import dataStructures.TreeNode;

public class Solution {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null)  {
            return 0;
        }

        dfs(root);

        return maxSum;
    }

    //Return max path sum without split
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //Path consisting of a single node are valid
        //So if the sum of the subtree is negative we'd prefer not no include it in the max sum calculation for the node
        int leftMax = Math.max(dfs(root.left), 0);
        int rightMax = Math.max(dfs(root.right), 0);

        //Max path sum with a split from this node
        var maxIfSplitHere = root.val + leftMax + rightMax;

        maxSum = Math.max(maxIfSplitHere, maxSum);

        return root.val + Math.max(leftMax, rightMax);
    }
}

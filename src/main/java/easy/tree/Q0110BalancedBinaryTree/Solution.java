package easy.tree.Q0110BalancedBinaryTree;

/*
https://leetcode.com/problems/balanced-binary-tree/

Topics: Tree, Depth-First Search, Binary Tree

Time: O(n)
Space: O(max height), to hold recursive stack call
 */


import dataStructures.Pair;
import dataStructures.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfs(root).first;
    }

    private Pair<Boolean, Integer> dfs(TreeNode root) {
        if (root == null) {
            return new Pair<>(true, 0); //Base case, leaf nodes are balanced
        }

        var left = dfs(root.left);
        var right = dfs(root.right);

        //The tree is balanced if both of the subtrees are balanced
        //and their heights differ no more than one
        var isBalanced = left.first && right.first &&
            Math.abs(left.second - right.second) <= 1;

        return new Pair<>(isBalanced, 1 + Math.max(left.second, right.second));
    }
}

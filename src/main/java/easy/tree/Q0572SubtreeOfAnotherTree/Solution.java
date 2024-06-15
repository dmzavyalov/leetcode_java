package easy.tree.Q0572SubtreeOfAnotherTree;

/*
https://leetcode.com/problems/subtree-of-another-tree/description/

Tree, Depth-First Search, String Matching, Binary Tree, Hash Function

Time: O(s * t)
Space: O(max height), to hold recursive stack call
 */

import dataStructures.TreeNode;

public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }

        if (isSameTree(s, t)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null || s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}

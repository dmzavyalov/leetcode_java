package medium.tree.Q0235LowestCommonAncestorOfBST;

import dataStructures.TreeNode;

/*
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

Tree, Depth-First Search, String Matching, Binary Tree, Hash Function

Time: O(log N)
Space: O(1)

 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        var curr = root;
        while (curr != null) {
            if (p.val > curr.val && q.val > curr.val) {
                curr = curr.right;
            } else if (p.val < curr.val && q.val < curr.val) {
                curr = curr.left;
            } else {
                return curr;
            }
        }
        return curr;
    }
}

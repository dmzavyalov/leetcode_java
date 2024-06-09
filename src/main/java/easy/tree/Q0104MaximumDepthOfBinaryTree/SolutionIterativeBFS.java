package easy.tree.Q0104MaximumDepthOfBinaryTree;

import dataStructures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*

https://leetcode.com/problems/maximum-depth-of-binary-tree/

Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree

Time: O(n)
Space: O(n)

 */

public class SolutionIterativeBFS {
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                //We never add null nodes to the queue
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level++;
        }
        return level;
    }
}

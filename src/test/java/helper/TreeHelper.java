package helper;

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class TreeHelper {
    public static TreeNode arrayToTreeLevelOrder(Integer[] values) {
        TreeNode root = null;
        Queue<TreeNode> queue = new LinkedList<>();

        for (int i = 0; i < values.length; i++) {
            var node = null != values[i] ? new TreeNode(values[i]) : null;
            if (root == null) {
                root = node;
            } else if (queue.peek().left == null) {
                queue.peek().left = node;
            } else {
                queue.peek().right = node;
                queue.remove();
            }
            queue.add(node);
        }

        return root;
    }

    public static Integer[] treeToArrayLevelOrder(TreeNode root) {
        if (root == null) {
            return new Integer[]{};
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var node = queue.poll();
            result.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result.toArray(Integer[]::new);
    }

}

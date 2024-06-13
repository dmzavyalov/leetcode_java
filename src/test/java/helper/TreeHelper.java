package helper;

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class TreeHelper {
    public static TreeNode arrayToTreeLevelOrder(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (i < values.length) {
            TreeNode node = queue.poll();

            node.left = values[i] != null ?  new TreeNode(values[i]) : null;
            i++;
            if (node.left != null) {
                queue.add(node.left);
            }

            if (i < values.length) {
                node.right = values[i] != null ?  new TreeNode(values[i]) : null;
                i++;
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
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

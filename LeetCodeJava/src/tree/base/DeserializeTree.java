package tree.base;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 9/28/20
 */
public class DeserializeTree {
    public static TreeNode deserialize(String data) {
        if (data == "") return null;
        String[] nodes = data.split(",");
        Deque<TreeNode> queue = new ArrayDeque<>();
        int i = 0;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[i++]));
        queue.offer(root);
        while (i < nodes.length) {
            TreeNode parent = queue.poll();
            String leftValue = nodes[i++];
            if (leftValue.charAt(0) != 'n') {
                parent.left = new TreeNode(Integer.parseInt(leftValue));
                queue.offer(parent.left);
            }

            // HACK
            if (i >= nodes.length) continue;

            String rightValue = nodes[i++];
            if (rightValue.charAt(0) != 'n') {
                parent.right = new TreeNode(Integer.parseInt(rightValue));
                queue.offer(parent.right);
            }
        }
        return root;
    }
}

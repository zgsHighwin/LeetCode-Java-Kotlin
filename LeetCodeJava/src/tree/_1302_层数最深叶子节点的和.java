package tree;

import tree.base.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url:
 * Author:Savannah
 * Description:
 * <p>
 * 给你一棵二叉树的根节点 root ，请你返回 层数最深的叶子节点的和 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 * 输出：15
 * 示例 2：
 * <p>
 * 输入：root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
 * 输出：19
 * <p>
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [1, 104] 之间。
 * 1 <= Node.val <= 100
 * <p>
 * LeetCodeTesting 2021/3/31
 */
public class _1302_层数最深叶子节点的和 {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int r = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            r = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    continue;
                }
                r += poll.val;
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return r;
    }
}

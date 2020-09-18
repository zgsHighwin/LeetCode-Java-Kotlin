package tree;

import javafx.beans.property.ReadOnlyObjectProperty;
import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url:https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 * Author:Savannah
 * Description:
 * <p>
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 输出：[3, 14.5, 11]
 * 解释：
 * 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
 * LeetCodeTesting 9/17/20
 */

public class _637_二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        list.add((double) root.val);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double svg = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    continue;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                    svg += poll.left.val;
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                    svg += poll.right.val;
                }
            }
            if (svg != 0) {
                list.add(svg / size);
            }
        }
        return list;
    }

}

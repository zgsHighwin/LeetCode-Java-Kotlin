package tree;

import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/binary-tree-paths/
 * Author:Savannah
 * Description:
 * <p>
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * 输出: ["1->2->5", "1->3"]
 * <p>
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 * 通过次数69,332提交次数105,400
 * LeetCodeTesting 9/4/20
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class _257_二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {


    }
}

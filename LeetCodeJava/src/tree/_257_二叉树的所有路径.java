package tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/binary-tree-paths/
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
 * author:Savannah
 */
public class _257_二叉树的所有路径 {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        preOrderTraversal(root, list, "");
        return list;
    }

    public static void preOrderTraversal(TreeNode node, List<String> list, String path) {
        if(node==null){
            return;
        }
        path = path + node.val;
        if (node.right == null && node.left == null) {
            list.add(path);
        }

        if (node.left != null) {
            preOrderTraversal(node.left, list, path + "->");
        }
        if (node.right != null) {
            preOrderTraversal(node.right, list, path + "->");
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        node1.right = new TreeNode(5);
        node.right = new TreeNode(3);
        node.left = node1;
        System.out.println(binaryTreePaths(node));

    }
}

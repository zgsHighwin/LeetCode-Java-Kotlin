package tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * Author:Savannah
 * Description:
 * <p>
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * <p>
 * <p>
 * <p>
 * 例如：
 * <p>
 * 输入: 原始二叉搜索树:
 * 5
 * /   \
 * 2     13
 * <p>
 * 输出: 转换为累加树:
 * 18
 * /   \
 * 20     13
 * LeetCodeTesting 9/17/20
 */
public class _538_把二叉搜索树转换为累加树 {
    int max = 0;
    public TreeNode convertBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        inOrderTraversal(root, list, false);
        for (Integer integer : list) {
            max += integer;
        }
        //System.out.println(max);
        inOrderTraversal(root, list, true);
        return root;
    }


    public void inOrderTraversal(TreeNode node, List<Integer> list, boolean isOver) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, list, isOver);
        list.add(node.val);
        if (isOver) {
            max = max - node.val;
            node.val = max + node.val;

        }
        inOrderTraversal(node.right, list, isOver);
    }
}

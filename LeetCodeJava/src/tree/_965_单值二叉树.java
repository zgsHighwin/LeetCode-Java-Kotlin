package tree;

import tree.base.TreeNode;

import java.util.Stack;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 9/9/20
 */
public class _965_单值二叉树 {
    public boolean isUnivalTree2(TreeNode root) {
        if (root == null) return false;
        int initVal = root.val;
        TreeNode currentNode = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                if (currentNode.val != initVal) {
                    return false;
                }
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                currentNode = pop.right;
            }
        }
        return true;
    }

}

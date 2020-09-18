package tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * url:https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * Author:Savannah
 * Description:
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/14/20
 */
public class _94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        inOrderTraversalNoRecursive(root, list);
        return list;
    }

    public void inOrderTraversalNoRecursive(TreeNode treeNode, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();

        while (treeNode != null || !stack.isEmpty()) {

            while (treeNode != null) {
                stack.push(treeNode);
                treeNode = treeNode.left;
            }

            if (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                list.add(pop.val);
                treeNode = pop.right;
            }
        }
    }

    public void inOrderTraversalRecursive(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        inOrderTraversalRecursive(treeNode.left, list);
        list.add(treeNode.val);
        inOrderTraversalRecursive(treeNode.right, list);
    }
}

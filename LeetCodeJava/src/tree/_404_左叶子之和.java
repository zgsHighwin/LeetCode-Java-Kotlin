package tree;

import tree.base.TreeNode;

/**
 * url:https://leetcode-cn.com/problems/sum-of-left-leaves/
 * Author:Savannah
 * Description:
 * 计算给定二叉树的所有左叶子之和。
 * <p>
 * 示例：
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 *  
 * <p>
 * 通过次数62,441提交次数110,928
 * 在真实的面试中遇到过这道题？
 * <p>
 * 是
 * <p>
 * 否
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-left-leaves
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 11/25/20
 */
public class _404_左叶子之和 {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return sum;
        }
        preOrderTraversal(root, root);
        return sum;
    }

    public void preOrderTraversal(TreeNode parent, TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && parent.left == root) {
            sum += root.val;
        }
        preOrderTraversal(root, root.left);
        preOrderTraversal(root, root.right);
    }
}

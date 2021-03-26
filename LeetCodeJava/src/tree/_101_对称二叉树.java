package tree;

import apple.laf.JRSUIUtils;
import tree.base.TreeNode;

/**
 * url:https://leetcode-cn.com/problems/symmetric-tree/
 * Author:Savannah
 * Description:
 * 给定一个二叉树，检查它是否是镜像对称的。
 * <p>
 *  
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 *  
 * <p>
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 *  
 * <p>
 * 进阶：
 * <p>
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 11/25/20
 */
public class _101_对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        return preOrderTraversalValue(left, right);
    }


    public boolean preOrderTraversalValue(TreeNode left, TreeNode right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null && right != null) {
            System.out.println("right:" + right.val);
            return false;
        }
        if (left != null && right == null) {
            System.out.println("left:" + left.val);
            return false;
        }

        if (left.val != right.val) {
            System.out.println("l:" + left.val + " r:" + right.val);
            return false;
        }
        return preOrderTraversalValue(left.left, right.right) && preOrderTraversalValue(left.right, right.left);
    }

}


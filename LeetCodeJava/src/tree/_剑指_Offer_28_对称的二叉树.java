package tree;

import apple.laf.JRSUIUtils;
import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url:https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 * Author:Savannah
 * Description:
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * <p>
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * <p>
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * <p>
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/10/20
 */
public class _剑指_Offer_28_对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode nodeLef, TreeNode nodeRight) {

        if (nodeLef == null && nodeRight == null) {
            return true;
        }

        if (nodeLef == null) {
            return false;
        }

        if (nodeRight == null) {
            return false;
        }
        if (nodeLef.val == nodeRight.val) {
            return isSymmetric(nodeLef.left, nodeRight.right) && isSymmetric(nodeLef.right, nodeRight.left);
        } else return false;
    }
}

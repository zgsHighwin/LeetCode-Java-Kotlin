package tree;

import tree.base.TreeNode;

/**
 * url:https://leetcode-cn.com/problems/validate-binary-search-tree/
 * Author:Savannah
 * Description:
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 假设一个二叉搜索树具有如下特征：
 * <p>
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例 1:
 * <p>
 * 输入:
 * 2
 * / \
 * 1   3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:
 * 5
 * / \
 * 1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 11/25/20
 */
public class _98_验证二叉搜索树 {
    private boolean init;//主要是边界值的问题
    private int lastValue;
    private boolean isOk = true;

    public boolean isValidBST(TreeNode root) {
        check(root);
        return isOk;
    }

    public void check(TreeNode root) {
        if (root == null) {
            return;
        }
        isValidBST(root.left);
        int val = root.val;
        if (!init) {
            init = true;
            lastValue = val;
        } else {
            if (lastValue > val) {
                isOk = false;
            } else {
                lastValue = val;
            }
        }
        isValidBST(root.right);
    }
}

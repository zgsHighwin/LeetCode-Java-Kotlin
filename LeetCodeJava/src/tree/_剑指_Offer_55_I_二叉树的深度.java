package tree;

import tree.base.TreeNode;

/**
 * url:剑指 Offer 55 - I. 二叉树的深度
 * Author:Savannah
 * Description:
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 *
 * 例如：
 *
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/9/20
 */
public class _剑指_Offer_55_I_二叉树的深度 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}

package tree;

import tree.base.TreeNode;

/**
 * url:https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * Author:Savannah
 * Description:
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 11/26/20
 */
public class _108_将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sort(nums, 0, nums.length - 1);
    }

    public TreeNode sort(int[] nums, int l, int r) {
        if (l > r) return null;
        int mid = l + ((r - l) >> 1);
        System.out.println(nums[mid]);
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = sort(nums, l, mid - 1);
        treeNode.right = sort(nums, mid + 1, r);
        return treeNode;
    }
}

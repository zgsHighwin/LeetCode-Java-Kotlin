package tree;

import tree.base.TreeNode;

import java.util.*;

/**
 * url:https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * Author:Savannah
 * Description:
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其自底向上的层次遍历为：
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/9/20
 */
public class _107_二叉树的层次遍历_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> headList = new ArrayList<Integer>();
        headList.add(root.val);
        list.add(headList);
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> inList = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    continue;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                    inList.add(poll.left.val);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                    inList.add(poll.right.val);
                }
            }
            if(inList.size()!=0){
                list.add(0, inList);
            }
        }
        return list;
    }
}

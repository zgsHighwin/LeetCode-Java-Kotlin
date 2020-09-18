package tree;

import tree.base.TreeNode;

import java.util.Stack;

/**
 * url:https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * Author:Savannah
 * Description:
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：
 * <p>
 * 1
 * \
 * 3
 * /
 * 2
 * <p>
 * 输出：
 * 1
 * <p>
 * 解释：
 * 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/17/20
 */
public class _530_二叉搜索树的最小绝对差 {
    int min = 0;

    public int getMinimumDifference(TreeNode root) {
        Stack<Integer> stack = new Stack<Integer>();
        inOrderTraversal(root, stack);
        return min;
    }

    public void inOrderTraversal(TreeNode node, Stack<Integer> stack) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, stack);
        if (stack.isEmpty()) {
            stack.push(node.val);
        }
        stack.push(node.val);
        if(stack.size()>=2){
            if (min == 0) {
                min = Math.abs(node.val - stack.peek());
            } else {
                min = Math.min(min, Math.abs(node.val - stack.peek()));
            }
        }
        inOrderTraversal(node.right, stack);
    }
}

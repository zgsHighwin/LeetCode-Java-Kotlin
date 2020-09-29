package tree;

import tree.base.DeserializeTree;
import tree.base.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 -> 0 -> 1，那么它表示二进制数 01101，也就是 13 。
 * <p>
 * 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。
 * <p>
 * 以 10^9 + 7 为模，返回这些数字之和。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * <p>
 * <p>
 * 输入：[1,0,1,0,1,0,1]
 * 输出：22
 * 解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 *  
 * <p>
 * 提示：
 * <p>
 * 树中的结点数介于 1 和 1000 之间。
 * node.val 为 0 或 1 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-root-to-leaf-binary-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/28/20
 */
public class _1022_从根到叶的二进制数之和 {
    public static int sumRootToLeaf(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        preOrderTraversal(root, list, "");
        int sum = 0;
        for (String s : list) {
            sum += Integer.valueOf(s, 2);
        }

        return sum;
    }

    public static void preOrderTraversal(TreeNode treeNode, List<String> list, String path) {

        if (treeNode == null) {
            return;
        }
        path += treeNode.val;
        if (treeNode.left == null && treeNode.right == null) {
            list.add(path);
        }

        if (treeNode.left != null) {
            preOrderTraversal(treeNode.left, list, path);
        }

        if (treeNode.right != null) {
            preOrderTraversal(treeNode.right, list, path);
        }
    }

    public static void main(String[] args) {
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        TreeNode treeNode5 = new TreeNode(5);
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.right = treeNode4;
//        treeNode3.right = treeNode5;

        TreeNode node = DeserializeTree.deserialize("1,0,0,1,0,1,1,0,1");
        System.out.println(sumRootToLeaf(node));
    }


}

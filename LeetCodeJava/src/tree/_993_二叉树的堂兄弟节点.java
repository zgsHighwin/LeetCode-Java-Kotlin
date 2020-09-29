package tree;


import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url:https://leetcode-cn.com/problems/cousins-in-binary-tree/
 * Author:Savannah
 * Description:
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 * <p>
 * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
 * <p>
 * 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
 * <p>
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,2,3,4], x = 4, y = 3
 * 输出：false
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
 * 输出：true
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * 输入：root = [1,2,3,null,4], x = 2, y = 3
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * 二叉树的节点数介于 2 到 100 之间。
 * 每个节点的值都是唯一的、范围为 1 到 100 的整数。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cousins-in-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/23/20
 */
public class _993_二叉树的堂兄弟节点 {
    public static boolean isCousins(TreeNode root, int x, int y) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        List<List<TreeNode>> out = new ArrayList<>();
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        out.add(treeNodes);
        while (!queue.isEmpty()) {
            int size = queue.size();
            //每层的元素
            List<TreeNode> list = new ArrayList<>();
            int j = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll == null) {
                    continue;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                    list.add(poll.left);
                    if (poll.left.val == x || poll.left.val == y) {
                        j++;
                    }
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                    list.add(poll.right);
                    if (poll.right.val == x || poll.right.val == y) {
                        j++;
                    }
                }

            }
            if (j != 0 && j != 2) { //不在同一层
                return false;
            }

            if (out.size() == 2) {
                out.remove(0);
            }
            out.add(list);

            if (j == 2) {
                if (out.get(0).size() == 1) {
                    return false;//只有一个节点
                }
                for (TreeNode node : out.get(0)) {

                    if (node.left == null && node.right == null) {
                        if (out.get(0).size() == 2) {
                            return false;
                        }
                        continue;
                    }

                    if (node.left == null || node.right == null) {
                       continue;
                    }


                    if ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.right= treeNode4;
//        treeNode3.right = treeNode5;
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        System.out.println(isCousins(treeNode1, 2, 3));


    }

}
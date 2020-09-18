package tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/leaf-similar-trees/
 * Author:Savannah
 * Description:
 * 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 * <p>
 * <p>
 * <p>
 * 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。
 * <p>
 * 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
 * <p>
 * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
 * <p>
 *  
 * <p>
 * 提示：
 * <p>
 * 给定的两颗树可能会有 1 到 200 个结点。
 * 给定的两颗树上的值介于 0 到 200 之间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/leaf-similar-trees
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/17/20
 */
public class _872_叶子相似的树 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        traversal(root1, li1);
        traversal(root2, li2);
        System.out.println(li1);
        System.out.println(li2);
        return li1.equals(li2);
    }


    public void traversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        if (node.left == null&&node.right==null) {
            list.add(node.val);
        }
        traversal(node.left, list);

        traversal(node.right, list);

    }
}

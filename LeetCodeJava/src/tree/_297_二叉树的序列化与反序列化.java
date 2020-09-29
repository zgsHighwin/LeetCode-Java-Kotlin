package tree;

import tree.base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url:
 * Author:Savannah
 * Description:
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * <p>
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * <p>
 * 示例: 
 * <p>
 * 你可以将以下二叉树：
 * <p>
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * <p>
 * 序列化为 "[1,2,3,null,null,4,5]"
 * 提示: 这与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * <p>
 * 说明: 不要使用类的成员 / 全局 / 静态变量来存储状态，你的序列化和反序列化算法应该是无状态的。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/23/20
 */
public class _297_二叉树的序列化与反序列化 {
    // Encodes a tree to a single string.
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(serialize(treeNode1));
        TreeNode treeNode = deserialize("[1,2,3,null,null,4,5]");

        preOrderTraversal(treeNode);
    }

    public static void preOrderTraversal(TreeNode treeNode) {

        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.val);
        preOrderTraversal(treeNode.left);
        preOrderTraversal(treeNode.right);
    }

    public static String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        builder.append(root.val);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            builder.append(",");
            if (poll.left == null) {
                builder.append("null");
            } else {
                queue.offer(poll.left);
                builder.append(poll.left.val);
            }
            builder.append(",");
            if (poll.right == null) {
                builder.append("null");
            } else {
                queue.offer(poll.right);
                builder.append(poll.right.val);
            }
        }
        builder.append("]");
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        return null;
    }
}

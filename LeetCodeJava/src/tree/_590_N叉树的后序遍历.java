package tree;

import java.lang.reflect.Array;
import java.util.*;

/**
 * url:https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * Author:Savannah
 * Description:
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 *  
 * <p>
 * 返回其后序遍历: [5,6,3,2,4,1].
 * <p>
 *  
 * <p>
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/10/20
 */


public class _590_N叉树的后序遍历 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    /**
     * 递归
     *
     * @param root
     * @return
     */

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        postOrderTraversal(root, list);
        return list;
    }

    public void postOrderTraversal(Node root, List<Integer> list) {

        if (root == null) {
            return;
        }

        List<Node> children = root.children;
        for (Node child : children) {
            postOrderTraversal(child, list);
        }
        list.add(root.val);
    }


    public List<Integer> postorder2(Node root) {
        return postOrderTraversal2(root);
    }

    private List<Integer> postOrderTraversal2(Node root) {
        Node currentNode = root;
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);

        while (currentNode != null) {
            currentNode = stack.pop();
            List<Node> children = currentNode.children;
            list.add(currentNode.val);
            if (children != null) {
                for (Node child : children) {
                    stack.push(child);
                }
            }
        }
        Collections.reverse(list);
        return list;
    }

}

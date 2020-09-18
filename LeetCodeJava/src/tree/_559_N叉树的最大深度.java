package tree;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给定一个 N 叉树，找到其最大深度。
 * <p>
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 * <p>
 * 例如，给定一个 3叉树 :
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 *  
 * <p>
 * 我们应返回其最大深度，3。
 * <p>
 * 说明:
 * <p>
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/17/20
 */

public class _559_N叉树的最大深度 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        List<Node> children = root.children;
        if (children == null || children.size() == 0) {
            return 1;
        }
        int max = 0;
        for (Node child : children) {
            max = Math.max(max, maxDepth(child));
        }

        return 1 + max;
    }
    public int maxDepth1(Node root) {

        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                Node poll = queue.poll();
                List<Node> children = null;
                if (poll != null) {
                    children = poll.children;
                    if (children == null || children.size() == 0) {
                        continue;
                    }
                    for (Node child : children) {
                        queue.offer(child);
                    }
                }
            }
        }
        return depth;
    }

    public static class Node {
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

}

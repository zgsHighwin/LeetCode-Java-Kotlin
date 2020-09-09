package linkedlist;

/**
 * url: https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/
 * Author:Savannah
 * Description:
 * <p>
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 * <p>
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 * 0
 * / \
 * -3   9
 * /   /
 * -10  5
 * 通过次数29,004提交次数40,085
 * LeetCodeTesting 6/8/20
 */
public class _109_有序链表转换二叉搜索树 {
    public static TreeNode sortedListToBST(ListNode head) {
//        ListNode fast = head;
        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
        TreeNode root = new TreeNode(slow.val);
//        TreeNode dummy = root;
//        ListNode node = head;
//        TreeNode parentTreeNode = root;
//        int cmp = 0;
//        while (node != null) {
//            if (node.val == root.val) {
//                dummy = root;
//                node = node.next;
//                continue;
//            }
//            while (dummy != null) {
//                cmp = node.val - dummy.val;
//                if (cmp < 0) {
//                    parentTreeNode = dummy;
//                    dummy = dummy.left;
//                } else {
//                    parentTreeNode = dummy;
//                    dummy = dummy.right;
//                }
//            }
//
//            if (cmp < 0) {//小于
//                parentTreeNode.left = new TreeNode(node.val);
//            } else {
//                parentTreeNode.right = new TreeNode(node.val);
//            }
//            dummy = root;
//            node = node.next;
//        }
        return root;
    }

    public static void main(String[] args) {
//        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,new ListNode(5))))));
//        TreeNode treeNode = sortedListToBST(listNode);
//        System.out.println(treeNode);
    }
}

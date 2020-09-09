package linkedlist;

/**
 * url:https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 * Author:Savannah
 * Description:
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * <p>
 * 注意：本题相对原题稍作改动
 * <p>
 * 示例：
 * <p>
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci
 * LeetCodeTesting 6/8/20
 */
public class _面试题_02_02_返回倒数第_k_个节点 {
    public static int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (k > 0) {
                k--;
            } else {
                slow = slow.next;
            }
            fast = fast.next;
        }
        return slow.val;

    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int i = kthToLast(listNode, 4);
        System.out.println(i);
    }

}

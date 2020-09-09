package linkedlist;

/**
 * url:https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * Author:Savannah
 * Description:将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * LeetCodeTesting 5/28/20
 */
public class _21_合并两个有序链表 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                dummy.next = l2;
                l2 = l2.next;
                dummy = dummy.next;
            } else {
                dummy.next = l1;
                l1 = l1.next;
                dummy = dummy.next;
            }
        }

        if (l1 == null) {
            dummy.next = l2;
        }

        if (l2 == null) {
            dummy.next = l1;
        }

        return head.next;
    }


    public static void main(String[] args) {
        _21_合并两个有序链表 test = new _21_合并两个有序链表();
        ListNode listNode11 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);
        listNode11.next = listNode12;
        listNode12.next = listNode13;

        ListNode listNode21 = new ListNode(1);
        ListNode listNode22 = new ListNode(3);
        ListNode listNode23 = new ListNode(4);
        listNode21.next = listNode22;
        listNode22.next = listNode23;

        ListNode listNode = mergeTwoLists(listNode11, listNode21);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

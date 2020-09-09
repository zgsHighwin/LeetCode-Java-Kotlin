package linkedlist;

/**
 * url:https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Author:Savannah
 * Description:
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 * LeetCodeTesting 6/5/20
 */
public class _83_Remove_Duplicates_from_Sorted_List {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = null;
        dummy.next = head;
        while (head != null) {
            if (pre != null && head.val == pre.val) {
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        listNode = deleteDuplicates(listNode);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

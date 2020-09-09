package linkedlist;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 6/4/20
 */
public class _206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {

    }
}

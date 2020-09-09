package linkedlist;

/**
 * url:https://leetcode.com/problems/remove-linked-list-elements/
 * Author:Savannah
 * Description:
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 * LeetCodeTesting 6/5/20
 */
public class _203_Remove_Linked_List_Elements {

    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode pre = head;
        ListNode node = head;
        while (node != null) {
            if (node.val == val) {
                node = node.next;
                pre.next = node;
            } else {
                pre = node;
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
//        ListNode listNode = new ListNode());
        listNode = removeElements(listNode, 6);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
    public ListNode removeElements2(ListNode head, int val) {
        ListNode itr = new ListNode (0, head);
        head = itr;
        while(itr.next != null){
            if(itr.next.val == val)
                itr.next = itr.next.next;
            else
                itr = itr.next;
        }
        return head.next;
    }
}

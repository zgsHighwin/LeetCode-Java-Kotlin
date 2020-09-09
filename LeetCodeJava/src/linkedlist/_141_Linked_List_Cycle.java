package linkedlist;

/**
 * url:https://leetcode.com/problems/linked-list-cycle/
 * Author:Savannah
 * Description:
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * <p>
 * <p>
 * Example 3:
 * <p>
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 * <p>
 * <p>
 * <p>
 * <p>
 * Follow up:
 * <p>
 * Can you solve it using O(1) (i.e. constant) memory?
 * LeetCodeTesting 6/5/20
 */
public class _141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        if(head==null){
            return false;
        }
        ListNode faster = head.next;
        if (head.next == head) {
            return true;
        }
        while (faster != null && faster.next != null) {
            if (slow == faster) {
                return true;
            }
            slow = slow.next;
            faster = faster.next.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

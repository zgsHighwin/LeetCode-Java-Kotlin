package linkedlist;

import java.util.ArrayList;
import java.util.Objects;

/**
 * url:https://leetcode.com/problems/palindrome-linked-list/
 * Author:Savannah
 * Description:
 * Example 1:
 * <p>
 * Input: 1->2
 * Output: false
 * Example 2:
 * <p>
 * Input: 1->2->2->1
 * Output: true
 * 1->1-2->1
 * false
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 * LeetCodeTesting 6/5/20
 */
public class _234_Palindrome_Linked_List {

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int size = list.size();
        for (int i = 0; i < (1 + size) / 2; i++) {
            if (!Objects.equals(list.get(i), list.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPalindrome2(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode slow = head;
        ListNode faster = head;
        ListNode pre = null;
        while (faster != null && faster.next != null) {
            faster = faster.next.next;
            ListNode temp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = temp;
        }
        if (faster != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }

        return true;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1)))))))));
//        ListNode listNode = new ListNode(1, new ListNode(2 ));

//        while (listNode!=null){
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
        System.out.println(isPalindrome2(listNode));
    }
}

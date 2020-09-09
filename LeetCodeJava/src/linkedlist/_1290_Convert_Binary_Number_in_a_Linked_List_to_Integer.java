package linkedlist;

/**
 * url:https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * Author:Savannah
 * Description:
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 * Example 2:
 * <p>
 * Input: head = [0]
 * Output: 0
 * Example 3:
 * <p>
 * Input: head = [1]
 * Output: 1
 * Example 4:
 * <p>
 * Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * Output: 18880
 * Example 5:
 * <p>
 * Input: head = [0,0]
 * Output: 0
 * <p>
 * LeetCodeTesting 6/4/20
 */
public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public static   int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(getDecimalValue(listNode));
    }

}

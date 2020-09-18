package linkedlist;

import java.util.List;

/**
 * url:https://leetcode.com/problems/add-two-numbers/
 * Author:Savannah
 * Description:Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * <p>
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * LeetCodeTesting 6/3/20
 */
public class _2_Add_Two_Numbers {
//    太大的数相加会丢失精度，这个后面再解
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        int finalValue = sum(l1) + sum(l2);
//        System.out.println(finalValue);
//        if (finalValue == 0) {
//            return new ListNode(0);
//        }
//        ListNode finalNode = null;
//        ListNode node = null;
//        boolean isNoZero = false;
//        while (finalValue != 0) {
//            int modValue = finalValue % 10;
//            finalValue = finalValue / 10;
//            if (modValue != 0) {
//                if (!isNoZero) {
//                    isNoZero = true;
//                }
//            }
//            if (modValue == 0 && !isNoZero) {
//                continue;
//            }
//
//            if (finalNode == null) {
//                finalNode = new ListNode(modValue);
//                node = finalNode;
//                continue;
//            }
//            finalNode.next = new ListNode(modValue);
//            finalNode = finalNode.next;
//        }
//        return node;
//    }
//
//    public static int sum(ListNode listNode) {
//        ListNode pPre = null;
//        ListNode pCur = listNode;
//        while (pCur != null) {
//            ListNode temp = pCur.next;
//            pCur.next = pPre;
//            pPre = pCur;
//            pCur = temp;
//        }
//
//        int sum = 0;
//        while (pPre != null) {
//            sum = sum * 10 + pPre.val;
//            pPre = pPre.next;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        ListNode listNode = addTwoNumbers(new ListNode(9), new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
//        while (listNode != null) {
//            System.out.println(listNode.val);
//            listNode = listNode.next;
//        }
//    }
}

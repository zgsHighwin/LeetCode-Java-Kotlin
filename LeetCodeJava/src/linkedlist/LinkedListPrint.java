package linkedlist;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 6/8/20
 */
public class LinkedListPrint {

    public static void print(ListNode node) {
        System.out.println("print start");
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("print end");
    }

}

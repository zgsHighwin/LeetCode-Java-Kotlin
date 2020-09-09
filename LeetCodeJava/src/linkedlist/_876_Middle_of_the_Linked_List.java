package linkedlist;

/**
 * url:https://leetcode.com/problems/middle-of-the-linked-list/
 * Author:Savannah
 * Description:Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * Example 2:
 *
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 * LeetCodeTesting 6/4/20
 */
public class _876_Middle_of_the_Linked_List {
    public static ListNode middleNode(ListNode head) {

        ListNode f = head; //fast
        ListNode s = head; //slow

        while (f != null&&f.next!=null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,new ListNode(6,new ListNode(7,new ListNode(8))))))));
//        ListNode listNode = new ListNode(1);
        ListNode listNode1 = middleNode(listNode);

        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }

    }
}

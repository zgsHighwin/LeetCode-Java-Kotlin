package linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * url:
 * Author:Savannah
 * Description:
 * <p>
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 * <p>
 * 返回同样按升序排列的结果链表。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/25
 */
public class _82_删除排序链表中的重复元素_II {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyNode = new ListNode(0, head);
        ListNode cur = dummyNode;
        int lastValue = dummyNode.val;
        List<Integer> list = new ArrayList<>();
        while (cur != null) {
            if (cur.next != null) {
                if (cur.next.val == lastValue) {
                    cur.next = cur.next.next;
                    list.add(lastValue);
                    continue;
                }
                lastValue = cur.next.val;
            }
            cur = cur.next;
        }
        cur = dummyNode;
        while (cur != null) {
            if (cur.next != null) {
                if (list.contains(cur.next.val)) {
                    cur.next = cur.next.next;
                    continue;
                }
            }
            cur = cur.next;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(5))))))))));
    }
}

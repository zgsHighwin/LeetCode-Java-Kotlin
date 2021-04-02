package linkedlist;

/**
 * url:https://leetcode-cn.com/problems/reverse-linked-list-ii/
 * Author:Savannah
 * Description:
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 * 示例 2：
 * <p>
 * 输入：head = [5], left = 1, right = 1
 * 输出：[5]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点数目为 n
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/31
 */
public class _92_反转链表_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        ListNode leftNodeFinal = dummy;
        ListNode middleHead = null;
        ListNode middleEnd = null;
        ListNode middleRight = null;
        int index = 0;
        while (cur != null) {
            if (index == left - 1) {
                ListNode temp = cur.next;
                leftNodeFinal = cur;
                leftNodeFinal.next = null;
                cur = temp;
                middleHead = temp;
                index++;
                continue;
            }

            if (index == right) {
                ListNode temp = cur.next;
                middleEnd = cur;
                middleEnd.next = null;
                cur = temp;
                middleRight = cur;
                index++;
                break;
            }
            cur = cur.next;
            index++;
        }

        cur = middleHead;
        middleEnd = cur;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        middleHead = pre;
        leftNodeFinal.next = middleHead;
        middleEnd.next = middleRight;
        return dummy.next;
    }
}

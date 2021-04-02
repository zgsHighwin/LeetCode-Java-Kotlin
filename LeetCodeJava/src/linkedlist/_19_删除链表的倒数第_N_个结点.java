package linkedlist;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/31
 */
public class _19_删除链表的倒数第_N_个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        ListNode fast = dummy;  //3/2
        int k = n;
        while (cur != null) {
            if (k > 0) {
                k--;
            } else {
                if (fast != null) {
                    cur = cur.next;
                } else {
                    if (cur.next != null) {
                        cur.next = cur.next.next;
                        break;
                    }
                }
            }
            if (fast != null) {
                fast = fast.next;
            }
        }
        return dummy.next;
    }

}

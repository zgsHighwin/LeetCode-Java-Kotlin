package linkedlist;

import java.util.List;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 * <p>
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1]
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 *  
 * <p>
 * 进阶：你能在不修改链表节点值的情况下解决这个问题吗?（也就是说，仅修改节点本身。）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-nodes-in-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/25
 */
public class _24_两两交换链表中的节点 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode finalHead = null;
        ListNode lastNode = null;
        int i = 0;
        boolean isHead = false;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
            i++;
            System.out.println(i);
            if (i == 2) {
                if (!isHead) {
                    finalHead = pre;
                    isHead = true;
                    lastNode = pre.next;
                } else {
                    lastNode.next = pre;
                    lastNode = pre.next;
                }
                pre = null;
                i = 0;
            }
            if (cur != null && cur.next == null) {
                if (lastNode != null) {
                    lastNode.next = cur;
                }
            }
        }
        return finalHead;
    }

    public static void main(String[] args) {
        System.out.println(swapPairs(new ListNode(1, new ListNode(2))));
    }
}

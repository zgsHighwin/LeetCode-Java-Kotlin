package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * url:https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 * Author:Savannah
 * Description:
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * <p>
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 * 示例2:
 * <p>
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 * 提示：
 * <p>
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * 进阶：
 * <p>
 * 如果不得使用临时缓冲区，该怎么解决？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-node-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/31
 */
public class _面试题_02_01_移除重复节点 {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        ListNode cur = head;
        set.add(head.val);
        while (cur != null) {
            if (cur.next != null) {
                if (set.contains(cur.next.val)) {
                    cur.next = cur.next.next;
                    continue;
                } else {
                    set.add(cur.next.val);
                }
            }
            cur = cur.next;
        }
        return head;
    }
}

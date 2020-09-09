package linkedlist;

/**
 * url:https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * Author:Savannah
 * Description:
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *  
 * <p>
 * 限制：
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 7/3/20
 */
public class _剑指_Offer_06_从尾到头打印链表 {
    public static int[] reversePrint(ListNode head) {

        ListNode pre = null;
        int i = 0;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
            i++;
        }
        int[] res = new int[i];
        i = 0;
        while (pre != null) {
            res[i] = pre.val;
            pre = pre.next;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(3, new ListNode(2)));
        reversePrint(listNode);
    }











}

package string;

/**
 * url:https://leetcode-cn.com/problems/find-kth-bit-in-nth-binary-string/
 * Author:Savannah
 * Description:
 * 给你两个正整数 n 和 k，二进制字符串  Sn 的形成规则如下：
 * <p>
 * S1 = "0"
 * 当 i > 1 时，Si = Si-1 + "1" + reverse(invert(Si-1))
 * 其中 + 表示串联操作，reverse(x) 返回反转 x 后得到的字符串，而 invert(x) 则会翻转 x 中的每一位（0 变为 1，而 1 变为 0）
 * <p>
 * 例如，符合上述描述的序列的前 4 个字符串依次是：
 * <p>
 * S1 = "0"
 * S2 = "011"
 * S3 = "0111001"
 * S4 = "011100110110001"
 * 请你返回  Sn 的 第 k 位字符 ，题目数据保证 k 一定在 Sn 长度范围以内。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3, k = 1
 * 输出："0"
 * 解释：S3 为 "0111001"，其第 1 位为 "0" 。
 * 示例 2：
 * <p>
 * 输入：n = 4, k = 11
 * 输出："1"
 * 解释：S4 为 "011100110110001"，其第 11 位为 "1" 。
 * 示例 3：
 * <p>
 * 输入：n = 1, k = 1
 * 输出："0"
 * 示例 4：
 * <p>
 * 输入：n = 2, k = 3
 * 输出："1"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 20
 * 1 <= k <= 2n - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-kth-bit-in-nth-binary-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/17/20
 */
public class _1545_找出第_N_个二进制字符串中的第_K_位 {
    public static char findKthBit(int n, int k) {
        if(n==1){
            return '0';
        }
        int mid = 1 << (n - 1);
        if (k < mid) {
            return findKthBit(n - 1, k);
        } else if (k == mid) {
            return '1';
        } else {
            k = k - mid;
            k = mid - k;
            return findKthBit(n - 1, k) == '1' ? '0' : '1';
        }
    }
//    public static char findKthBit1(int n, int k) {
//        if(k==Math.pow(2,n-1)){
//            return '1';
//        }
//        StringBuilder last = new StringBuilder("0");
//        for (int i = 0; i < n - 1; i++) {
//            String s = last.toString();
//            last.append('1');
//            last.append(reverse(invert(s)));
//        }
//        System.out.println(last.toString());
//        return last.toString().charAt(--k);
//    }

//    public static char[] reverse(char[] reverse) {
//        for (int i = 0; i < (reverse.length >> 1); i++) {
//            char temp = reverse[i];
//            reverse[i] = reverse[reverse.length - 1 - i];
//            reverse[reverse.length - 1 - i] = temp;
//        }
//        return reverse;
//    }
//
//    public static char[] invert(String s) {
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            chars[i] = chars[i] == '0' ? '1' : '0';
//        }
//        return chars;
//    }

    public static void main(String[] args) {
        System.out.println(findKthBit(4, 11));
//        System.out.println(reverse(new char[]{'1', '1', '0', '1', '0'}));
    }
}

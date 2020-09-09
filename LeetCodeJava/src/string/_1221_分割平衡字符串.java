package string;

/**
 * url:https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * Author:Savannah
 * Description:
 * <p>
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
 * <p>
 * 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 返回可以通过分割得到的平衡字符串的最大数量。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "RLRRLLRLRL"
 * 输出：4
 * 解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 2：
 * <p>
 * 输入：s = "RLLLLRRRLR"
 * 输出：3
 * 解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 * 示例 3：
 * <p>
 * 输入：s = "LLLLRRRR"
 * 输出：1
 * 解释：s 只能保持原样 "LLLLRRRR".
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 7/2/20
 */
public class _1221_分割平衡字符串 {
    public static int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        char lastChar = 0;
        int i = 0;
        int repeatCount = 0;
        int res = 0;
        for (; ; ) {
            if (lastChar == 0) {
                lastChar = chars[i];
                i++;
                repeatCount++;
            } else {
                if (lastChar == chars[i]) {
                    i++;
                    repeatCount++;
                } else {
                    i += repeatCount;
                    repeatCount = 0;
                    lastChar = 0;
                    res++;
                }
            }
            if (i >= chars.length) {
                return res;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RRLRRLRLLLRL"));
    }
}

package string;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
 * <p>
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s1 = "bank", s2 = "kanb"
 * 输出：true
 * 解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
 * 示例 2：
 * <p>
 * 输入：s1 = "attack", s2 = "defend"
 * 输出：false
 * 解释：一次字符串交换无法使两个字符串相等
 * 示例 3：
 * <p>
 * 输入：s1 = "kelb", s2 = "kelb"
 * 输出：true
 * 解释：两个字符串已经相等，所以不需要进行字符串交换
 * 示例 4：
 * <p>
 * 输入：s1 = "abcd", s2 = "dcba"
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s1.length, s2.length <= 100
 * s1.length == s2.length
 * s1 和 s2 仅由小写英文字母组成
 * 通过次数10,506提交次数15,161
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-one-string-swap-can-make-strings-equal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/9
 */
public class _1790_仅执行一次字符串交换能否使两个字符串相等 {
    public static void main(String[] args) {
        _1790_仅执行一次字符串交换能否使两个字符串相等 v = new _1790_仅执行一次字符串交换能否使两个字符串相等();
        System.out.println(v.areAlmostEqual("bank", "kanb"));
    }
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int difIndex1 = -1;
        int difIndex2 = -1;
        int cnt = 0;
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                if (cnt > 1) {
                    return false;
                }
                if (cnt == 0) {
                    difIndex1 = i;
                }
                if (cnt == 1) {
                    difIndex2 = i;
                }
                cnt++;
            }
        }
        if (cnt != 2) {
            return false;
        }
        return s1.charAt(difIndex1) == s2.charAt(difIndex2) && s1.charAt(difIndex2) == s2.charAt(difIndex1);
    }
}

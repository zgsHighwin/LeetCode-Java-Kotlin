package string;

/**
 * url:https://leetcode-cn.com/problems/is-unique-lcci/
 * Author:Savannah
 * Description:实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 * <p>
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 * <p>
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/is-unique-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 8/31/20
 */
public class _面试题_01_01_判定字符是否唯一 {
    public static boolean isUnique(String astr) {
        int[] data = new int[128];
        char[] chars = astr.toCharArray();
        for (char aChar : chars) {
            data[(int) aChar]++;
        }
        for (int datum : data) {
            if (datum > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("aabc"));
    }
}

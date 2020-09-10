package bitmanipulation;

/**
 * url:https://leetcode-cn.com/problems/find-the-difference/
 * Author:Savannah
 * Description:
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * <p>
 * 输出：
 * e
 * <p>
 * 解释：
 * 'e' 是那个被添加的字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/10/20
 */
public class _389_找不同 {
    public static char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int f = 0;
        for (char c : chars) {
            f ^= (int) c;
        }

        for (char c : chars2) {
            f ^= c;
        }
        return (char) f;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abecd"));

    }
}

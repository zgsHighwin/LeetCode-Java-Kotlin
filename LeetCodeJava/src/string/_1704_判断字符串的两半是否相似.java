package string;

import java.util.HashSet;
import java.util.Set;

/**
 * url:https://leetcode-cn.com/problems/determine-if-string-halves-are-alike/
 * Author:Savannah
 * Description:
 * 给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。
 * <p>
 * 两个字符串 相似 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * <p>
 * 如果 a 和 b 相似，返回 true ；否则，返回 false 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "book"
 * 输出：true
 * 解释：a = "bo" 且 b = "ok" 。a 中有 1 个元音，b 也有 1 个元音。所以，a 和 b 相似。
 * 示例 2：
 * <p>
 * 输入：s = "textbook"
 * 输出：false
 * 解释：a = "text" 且 b = "book" 。a 中有 1 个元音，b 中有 2 个元音。因此，a 和 b 不相似。
 * 注意，元音 o 在 b 中出现两次，记为 2 个。
 * 示例 3：
 * <p>
 * 输入：s = "MerryChristmas"
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：s = "AbCdEfGh"
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= s.length <= 1000
 * s.length 是偶数
 * s 由 大写和小写 字母组成
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/determine-if-string-halves-are-alike
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/30
 */
public class _1704_判断字符串的两半是否相似 {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() >> 1;
        int l = 0;
        int r = 0;
        for (int i = 0; i < mid; i++) {
            if (hasVowels(s.charAt(i))) {
                l++;
            }
            if (hasVowels(s.charAt(i + mid))) {
                r++;
            }

        }
        return r == l;
    }



    public boolean hasVowels(char c) {
        if (c == 'a') {
            return true;
        }
        if (c == 'e') {
            return true;
        }
        if (c == 'i') {
            return true;
        }
        if (c == 'o') {
            return true;
        }
        if (c == 'u') {
            return true;
        }
        if (c == 'A') {
            return true;
        }
        if (c == 'E') {
            return true;
        }
        if (c == 'I') {
            return true;
        }
        if (c == 'O') {
            return true;
        }
        if (c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _1704_判断字符串的两半是否相似 v = new _1704_判断字符串的两半是否相似();
        System.out.println(v.halvesAreAlike("AbCdEfGh"));
    }

}

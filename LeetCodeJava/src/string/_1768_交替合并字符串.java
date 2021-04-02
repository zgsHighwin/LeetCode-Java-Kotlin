package string;

/**
 * url:https://leetcode-cn.com/problems/merge-strings-alternately/
 * Author:Savannah
 * Description:
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 * <p>
 * 返回 合并后的字符串 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：word1 = "abc", word2 = "pqr"
 * 输出："apbqcr"
 * 解释：字符串合并情况如下所示：
 * word1：  a   b   c
 * word2：    p   q   r
 * 合并后：  a p b q c r
 * 示例 2：
 * <p>
 * 输入：word1 = "ab", word2 = "pqrs"
 * 输出："apbqrs"
 * 解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
 * word1：  a   b
 * word2：    p   q   r   s
 * 合并后：  a p b q   r   s
 * 示例 3：
 * <p>
 * 输入：word1 = "abcd", word2 = "pq"
 * 输出："apbqcd"
 * 解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
 * word1：  a   b   c   d
 * word2：    p   q
 * 合并后：  a p b q c   d
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-strings-alternately
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/30
 */
public class _1768_交替合并字符串 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pqaaa3d"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int ml = 0;
        String postfix = null;
        if (l1 == l2) {
            ml = l1;
        } else if (l1 > l2) {
            postfix = word1.substring(l2);
            ml = l2;
        } else {
            postfix = word2.substring(l1);
            ml = l1;
        }
        for (int i = 0; i < ml; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            sb.append(c1);
            sb.append(c2);
        }
        if (postfix != null) {
            sb.append(postfix);
        }
        return sb.toString();
    }
}

package string;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/repeated-substring-pattern/
 * Author:Savannah
 * Description:
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abab"
 * <p>
 * 输出: True
 * <p>
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * 示例 2:
 * <p>
 * 输入: "aba"
 * <p>
 * 输出: False
 * 示例 3:
 * <p>
 * 输入: "abcabcabcabc"
 * <p>
 * 输出: True
 * <p>
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/repeated-substring-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/11/20
 */
public class _459_重复的子字符串 {
    public static boolean repeatedSubstringPattern(String s) {
        if (s == null) {
            return false;
        }

        char[] chars = s.toCharArray();
        char lChar = chars[s.length() - 1];//最后一个字符
        List<Character> charList = new ArrayList<>();
        for (int i = 1; i <=(chars.length >> 1); i++) {
            String s1 = s.substring(0, i);
            System.out.println(s1);
            if (chars[i-1] == lChar && (s.length() % i) == 0) {
                int len = s.length() / i;
                int subLen = s1.length();
                boolean isEquals = true;
                for (int j = 0; j < s.length(); j += subLen) {
                    if (!s1.equals(s.substring(j, j + subLen))) {
                        isEquals = false;
                        break;
                    }
                    System.out.println(j);
                }
                if (isEquals) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababba"));
    }
}

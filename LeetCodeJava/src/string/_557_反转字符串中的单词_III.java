package string;

import java.util.Arrays;

/**
 * url:
 * Author:Savannah
 * Description:
 * <p>
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 * <p>
 * <p>
 * 提示：
 * <p>
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * LeetCodeTesting 9/14/20
 */
public class _557_反转字符串中的单词_III {
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int second = 0;
        int first = 0;
        boolean has = false;
        boolean isFind = false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                if (has) {
                    has = false;
                    --second;
                    reverse(chars, first, second);
                    second++;
                    first = second;
                    isFind = false;
                }
            } else {
                has = true;
                if (!isFind) {
                    isFind = true;
                    first = second;
                }
            }
            second++;
        }
        if(has){
            reverse(chars,first,chars.length-1);
        }
        return new String(chars);
    }

    public static void reverse(char[] c, int first, int second) {
        while ((first < second)) {
            char temp = c[first];
            c[first] = c[second];
            c[second] = temp;
            first++;
            second--;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("   ab cd efg, aaabbb  "));
        System.out.println(reverseWords("ab cd efg, aaabbb  "));
        System.out.println(reverseWords("ab cd efg, aaabbb"));
        System.out.println(reverseWords("   "));
    }
}

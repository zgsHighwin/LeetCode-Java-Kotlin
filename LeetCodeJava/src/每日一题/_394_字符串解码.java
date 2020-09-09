package 每日一题;

import java.util.Stack;

/**
 * url:https://leetcode-cn.com/problems/decode-string/
 * Author:Savannah
 * Description:
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * <p>
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 * <p>
 * 示例:
 * <p>
 * s = "3[a]2[bc]", 返回 "aaabcbc".
 * s = "3[a2[c]]", 返回 "accaccacc".
 * s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".
 */
public class _394_字符串解码 {
    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        StringBuilder num = new StringBuilder();
        StringBuilder alp = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isDigit(c)) {
                num.append(c);
                if (!"".equals(alp.toString())) {
                    stack.push(alp.toString());
                    alp = new StringBuilder();
                }
            } else if (c == '[') {
                stack.push(num.toString());
                stack.push("[");
                num = new StringBuilder();
            } else if (c != ']') {
                alp.append(c);
                if (i == charArray.length - 1 && !"".equals(alp.toString())) {
                    stack.push(alp.toString());
                }
            } else {
                if (!"".equals(alp.toString())) {
                    stack.push(alp.toString());
                }
                alp = new StringBuilder();
                String popValue = "";
                String temp = "";
                while (!"[".equals(popValue)) {
                    popValue = stack.pop();
                    if (!"[".equals(popValue)) {
                        temp = popValue + temp;
                    }
                }
                String popInt = stack.pop();
                for (int j = 0; j < Integer.parseInt(popInt); j++) {
                    alp.append(temp);
                }
                stack.push(alp.toString());
                alp = new StringBuilder();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String value : stack) {
            sb.append(value);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }
}
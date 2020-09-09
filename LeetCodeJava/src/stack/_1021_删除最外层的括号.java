package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * url:
 * Author:Savannah
 * Description:
 * <p>
 * 有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。
 * <p>
 * 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。
 * <p>
 * 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。
 * <p>
 * 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * 示例 2：
 * <p>
 * 输入："(()())(())(()(()))"
 * 输出："()()()()(())"
 * 解释：
 * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 * 示例 3：
 * <p>
 * 输入："()()"
 * 输出：""
 * 解释：
 * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 * 删除每个部分中的最外层括号后得到 "" + "" = ""。
 * <p>
 * <p>
 * 提示：
 * <p>
 * S.length <= 10000
 * S[i] 为 "(" 或 ")"
 * S 是一个有效括号字符串
 * LeetCodeTesting 7/2/20
 */
public class _1021_删除最外层的括号 {
    public static String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = S.toCharArray();
        List<Integer> list = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                if (j != 0) {
                    list.add(j);
                }
                stack.push(chars[i]);
            } else {
                if (chars[i] == '(') {
                    stack.push('(');
                }
                if (chars[i] == ')') {
                    stack.pop();
                    j += 2;
                }
            }
        }
        list.add(j);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        int last = 0;

        for (int i = 0; i < list.size(); i++) {
            int right = list.get(i);
            stringBuilder.append(S.substring(last + 1, right - 1));
            last = right;
        }


        return stringBuilder.toString();
    }

    public static String removeOuterParentheses2(String S) {

        int level = 0;
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == '(') {
                level++;
            }
            if (level >1) {
                stringBuilder.append(c);
            }

            if (c == ')') {
                level--;
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

        System.out.println(removeOuterParentheses2("(()())(())(()(()))"));
    }
}
